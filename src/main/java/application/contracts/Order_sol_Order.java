package application.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
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
public final class Order_sol_Order extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516105f33803806105f383398101604090815281516020830151918301516060840151608085015160008481556001869055918601805194969394909391909101918391811061005f57fe5b6020908102909101015160025581518290600190811061007b57fe5b6020908102909101015160035581518290600290811061009757fe5b602090810290910101516004558051819060009081106100b357fe5b602090810290910101516005558051819060019081106100cf57fe5b602090810290910101516006558051819060029081106100eb57fe5b6020908102909101015160075580518190600390811061010757fe5b6020908102909101015160085581518290600390811061012357fe5b6020908102909101015160095581518290600490811061013f57fe5b60209081029091010151600a5560ff8316600b5580518190600490811061016257fe5b60209081029091010151600c555050505050610470806101836000396000f3006080604052600436106101535763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166311b5e48681146101585780631ed391961461017f5780632393aa1b1461019457806331b3202c146101ae578063375fb87a146101c657806337f9cf20146101de57806338fe5c8c146101f65780633e0a322d1461020b57806347bcc741146102235780636e27dc3e1461023b5780637cd87ba2146102535780638081142014610268578063823b8ba21461028057806389eff1331461029557806391b7f5ed146102aa57806398d5fdca146102c25780639ed9495a146102d75780639fa89030146102ec5780639fdc8e8f14610301578063a849642614610319578063c1adfb0a1461032e578063c4b3186914610343578063c828371e14610358578063ca87b54c1461036d578063df1f16ec14610385578063e874eaaa1461039d575b600080fd5b34801561016457600080fd5b5061016d6103b5565b60408051918252519081900360200190f35b34801561018b57600080fd5b5061016d6103bb565b3480156101a057600080fd5b506101ac6004356103c1565b005b3480156101ba57600080fd5b506101ac6004356103c6565b3480156101d257600080fd5b506101ac6004356103cb565b3480156101ea57600080fd5b506101ac6004356103d0565b34801561020257600080fd5b5061016d6103d5565b34801561021757600080fd5b506101ac6004356103db565b34801561022f57600080fd5b506101ac6004356103e0565b34801561024757600080fd5b506101ac6004356103e5565b34801561025f57600080fd5b5061016d6103ea565b34801561027457600080fd5b506101ac6004356103f0565b34801561028c57600080fd5b5061016d6103f5565b3480156102a157600080fd5b5061016d6103fb565b3480156102b657600080fd5b506101ac600435610401565b3480156102ce57600080fd5b5061016d610406565b3480156102e357600080fd5b5061016d61040c565b3480156102f857600080fd5b5061016d610412565b34801561030d57600080fd5b506101ac600435610418565b34801561032557600080fd5b5061016d61041d565b34801561033a57600080fd5b5061016d610423565b34801561034f57600080fd5b5061016d610429565b34801561036457600080fd5b5061016d61042f565b34801561037957600080fd5b506101ac600435610435565b34801561039157600080fd5b506101ac60043561043a565b3480156103a957600080fd5b506101ac60043561043f565b600a5490565b60085490565b600855565b600055565b600255565b600555565b600b5490565b600955565b600b55565b600455565b60045490565b600655565b60075490565b60025490565b600355565b60035490565b600c5490565b60015490565b600755565b60005490565b60065490565b60055490565b60095490565b600c55565b600a55565b6001555600a165627a7a723058206a168c69ac2add0e3a55ea067f35c21ec0281296c3c59fbb2ce5036cf79aa4960029";

    private Order_sol_Order(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Order_sol_Order(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<BigInteger> getLeaveTime() {
        Function function = new Function("getLeaveTime", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> getAroundSite() {
        Function function = new Function("getAroundSite", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setAroundSite(byte[] around) {
        Function function = new Function(
                "setAroundSite", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(around)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
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

    public RemoteCall<TransactionReceipt> setFacility(byte[] _facilities) {
        Function function = new Function(
                "setFacility", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_facilities)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getRoomNum() {
        Function function = new Function("getRoomNum", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setStartTime(BigInteger start) {
        Function function = new Function(
                "setStartTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(start)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setRoomNum(BigInteger num) {
        Function function = new Function(
                "setRoomNum", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(num)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setCreateDate(BigInteger date) {
        Function function = new Function(
                "setCreateDate", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(date)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getCreateDate() {
        Function function = new Function("getCreateDate", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setRoomType(byte[] rType) {
        Function function = new Function(
                "setRoomType", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(rType)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getHotelType() {
        Function function = new Function("getHotelType", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
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

    public RemoteCall<BigInteger> getPrice() {
        Function function = new Function("getPrice", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> getRoomAddress() {
        Function function = new Function("getRoomAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<BigInteger> getTenantId() {
        Function function = new Function("getTenantId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setHotelType(byte[] hType) {
        Function function = new Function(
                "setHotelType", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(hType)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getOrderId() {
        Function function = new Function("getOrderId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> getRoomType() {
        Function function = new Function("getRoomType", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getFacility() {
        Function function = new Function("getFacility", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<BigInteger> getStartTime() {
        Function function = new Function("getStartTime", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setRoomAddress(byte[] rAddress) {
        Function function = new Function(
                "setRoomAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(rAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setLeaveTime(BigInteger leave) {
        Function function = new Function(
                "setLeaveTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(leave)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setTenantId(BigInteger id) {
        Function function = new Function(
                "setTenantId", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Order_sol_Order> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _orderId, BigInteger _tenantId, BigInteger _roomNum, List<BigInteger> _otherIntInfo, List<byte[]> _otherStrInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_orderId), 
                new org.web3j.abi.datatypes.generated.Uint256(_tenantId), 
                new org.web3j.abi.datatypes.generated.Uint8(_roomNum), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_otherIntInfo, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherStrInfo, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Order_sol_Order.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Order_sol_Order> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _orderId, BigInteger _tenantId, BigInteger _roomNum, List<BigInteger> _otherIntInfo, List<byte[]> _otherStrInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_orderId), 
                new org.web3j.abi.datatypes.generated.Uint256(_tenantId), 
                new org.web3j.abi.datatypes.generated.Uint8(_roomNum), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_otherIntInfo, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherStrInfo, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Order_sol_Order.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Order_sol_Order load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Order_sol_Order(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Order_sol_Order load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Order_sol_Order(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
