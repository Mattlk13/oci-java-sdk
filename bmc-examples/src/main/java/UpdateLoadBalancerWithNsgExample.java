/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.loadbalancer.LoadBalancerClient;
import com.oracle.bmc.loadbalancer.model.UpdateNetworkSecurityGroupsDetails;
import com.oracle.bmc.loadbalancer.requests.UpdateNetworkSecurityGroupsRequest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This sample demonstrates the process of updating the network security groups for a load balancer.
 * A network security group (NSG) provides virtual firewall rules for a specified set of VNICs and load balancers
 * in a VCN. Compare NSGs with SecurityLists, which provide virtual firewall rules to all the VNICs in a subnet.
 * Please refer to https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/ for more
 * information about creating network security groups using the API.
 * After creating an NSG, you can add load balancers to it with UpdateNetworkSecurityGroups. Please refer
 * to https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/methods/UpdateNetworkSecurityGroups
 * for more information about the LB NSG API.
 * This example requires an existing load balancer OCID and a comma-separated list of NSG OCIDs.
 * It will place the load balancer into the NSGs provided.
 */
public class UpdateLoadBalancerWithNsgExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "This example expects two argument: loadbalancer ocid and nsg ocids");
        }
        final String loadBalancerId = args[0];
        System.out.println("loadBalancerId = " + loadBalancerId);
        final String nsgids = args[1];
        List<String> networkSecurityGroupIds =
                Arrays.stream(nsgids.split(",")).collect(Collectors.toList());
        System.out.println("nsgIds = " + networkSecurityGroupIds);

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);

        LoadBalancerClient loadBalancerClient = new LoadBalancerClient(provider);

        loadBalancerClient.updateNetworkSecurityGroups(
                UpdateNetworkSecurityGroupsRequest.builder()
                        .loadBalancerId(loadBalancerId)
                        .updateNetworkSecurityGroupsDetails(
                                UpdateNetworkSecurityGroupsDetails.builder()
                                        .networkSecurityGroupIds(networkSecurityGroupIds)
                                        .build())
                        .build());
        loadBalancerClient.close();
        System.out.println("DONE");
    }
}
