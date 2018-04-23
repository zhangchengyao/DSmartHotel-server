package application.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.1.1.
 */
public final class Bid_sol_Bid extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516105053803806105058339810160409081528151602080840151928401516060850151608086015160a087015160c088015160e08901516000889055600189905560028690556003805460ff191660ff8716179055600484905591909801805196989496939592949093909261008f916005918601906100a5565b506006919091556007555061010d945050505050565b8280548282559060005260206000209081019282156100e0579160200282015b828111156100e05782518255916020019190600101906100c5565b506100ec9291506100f0565b5090565b61010a91905b808211156100ec57600081556001016100f6565b90565b6103e98061011c6000396000f3006080604052600436106100e55763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166331b3202c81146100ea578063375fb87a14610104578063422beeba1461011c5780635acb5edc1461013457806380ce60d11461019957806389eff133146101b457806391b7f5ed146101db578063977f38f4146101f357806398d5fdca1461020b5780639a7ef1c3146102205780639fa8903014610235578063a84964261461024a578063afd820671461025f578063d1d875a114610274578063de2927891461028c578063e874eaaa146102b7575b600080fd5b3480156100f657600080fd5b506101026004356102cf565b005b34801561011057600080fd5b506101026004356102d4565b34801561012857600080fd5b506101026004356102d9565b34801561014057600080fd5b506101496102de565b60408051602080825283518183015283519192839290830191858101910280838360005b8381101561018557818101518382015260200161016d565b505050509050019250505060405180910390f35b3480156101a557600080fd5b5061010260ff60043516610336565b3480156101c057600080fd5b506101c961034c565b60408051918252519081900360200190f35b3480156101e757600080fd5b50610102600435610352565b3480156101ff57600080fd5b50610102600435610357565b34801561021757600080fd5b506101c961038c565b34801561022c57600080fd5b506101c9610392565b34801561024157600080fd5b506101c9610398565b34801561025657600080fd5b506101c961039e565b34801561026b57600080fd5b506101c96103a4565b34801561028057600080fd5b506101026004356103aa565b34801561029857600080fd5b506102a16103af565b6040805160ff9092168252519081900360200190f35b3480156102c357600080fd5b506101026004356103b8565b600655565b600255565b600755565b6060600580548060200260200160405190810160405280929190818152602001828054801561032c57602002820191906000526020600020905b815481526020019060010190808311610318575b5050505050905090565b6003805460ff191660ff92909216919091179055565b60025490565b600455565b600580546001810182556000919091527f036b6384b5eca791c62761152d0c79bb0604c104a5fb6f4eb0703f3154bb3db00155565b60045490565b60005490565b60015490565b60065490565b60075490565b600055565b60035460ff1690565b6001555600a165627a7a72305820d1effc16ccd13039bb35e6f257ee4344480fa53c114e1f687d5cb8da65e2806a0029";

    private Bid_sol_Bid(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Bid_sol_Bid(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> setOrderId(BigInteger id) {
        Function function = new Function(
                "setOrderId", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setLandlordId(BigInteger id) {
        Function function = new Function(
                "setLandlordId", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setScore(BigInteger sc) {
        Function function = new Function(
                "setScore", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(sc)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<List<BigInteger>> getRoomIds() {
        Function function = new Function("getRoomIds", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return executeRemoteCallSingleValueReturn(function, List<BigInteger>.class);
    }

    public RemoteCall<TransactionReceipt> setResult(BigInteger theResult) {
        Function function = new Function(
                "setResult", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint8(theResult)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getLandlordId() {
        Function function = new Function("getLandlordId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setPrice(BigInteger thePrice) {
        Function function = new Function(
                "setPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(thePrice)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setRoomIds(BigInteger id) {
        Function function = new Function(
                "setRoomIds", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getPrice() {
        Function function = new Function("getPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getBidId() {
        Function function = new Function("getBidId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getTenantId() {
        Function function = new Function("getTenantId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getOrderId() {
        Function function = new Function("getOrderId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getScore() {
        Function function = new Function("getScore", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setBidId(BigInteger id) {
        Function function = new Function(
                "setBidId", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getResult() {
        Function function = new Function("getResult", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setTenantId(BigInteger id) {
        Function function = new Function(
                "setTenantId", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Bid_sol_Bid> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _bidId, BigInteger _tenantId, BigInteger _landlordId, BigInteger _result, BigInteger _price, List<BigInteger> _roomIds, BigInteger _orderId, BigInteger _score) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_bidId), 
                new org.web3j.abi.datatypes.generated.Uint256(_tenantId), 
                new org.web3j.abi.datatypes.generated.Uint256(_landlordId), 
                new org.web3j.abi.datatypes.generated.Uint8(_result), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_roomIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.Uint256(_orderId), 
                new org.web3j.abi.datatypes.generated.Uint256(_score)));
        return deployRemoteCall(Bid_sol_Bid.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Bid_sol_Bid> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _bidId, BigInteger _tenantId, BigInteger _landlordId, BigInteger _result, BigInteger _price, List<BigInteger> _roomIds, BigInteger _orderId, BigInteger _score) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_bidId), 
                new org.web3j.abi.datatypes.generated.Uint256(_tenantId), 
                new org.web3j.abi.datatypes.generated.Uint256(_landlordId), 
                new org.web3j.abi.datatypes.generated.Uint8(_result), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_roomIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.Uint256(_orderId), 
                new org.web3j.abi.datatypes.generated.Uint256(_score)));
        return deployRemoteCall(Bid_sol_Bid.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Bid_sol_Bid load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Bid_sol_Bid(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Bid_sol_Bid load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Bid_sol_Bid(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
