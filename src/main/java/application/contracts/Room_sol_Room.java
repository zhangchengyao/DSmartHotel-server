package application.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
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
public final class Room_sol_Room extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516101008061036983398101604090815281516020830151918301516060840151608085015160a086015160c087015160e0909701516000959095556001959095556002929092556003556004556005919091556006919091556007556102ea8061007f6000396000f3006080604052600436106100e55763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631395986381146100ea578063375fb87a146101045780633f051d9b1461011c5780634acbca7a14610134578063808114201461014c57806385be3e621461016457806386fbd66c1461018b57806389eff133146101a057806391b7f5ed146101b557806398d5fdca146101cd5780639ed9495a146101e2578063c1adfb0a146101f7578063c5482c141461020c578063ca87b54c14610221578063cf50e60314610239578063ead4cf0014610251575b600080fd5b3480156100f657600080fd5b50610102600435610266565b005b34801561011057600080fd5b5061010260043561026b565b34801561012857600080fd5b50610102600435610270565b34801561014057600080fd5b50610102600435610275565b34801561015857600080fd5b5061010260043561027a565b34801561017057600080fd5b5061017961027f565b60408051918252519081900360200190f35b34801561019757600080fd5b50610179610285565b3480156101ac57600080fd5b5061017961028b565b3480156101c157600080fd5b50610102600435610291565b3480156101d957600080fd5b50610179610296565b3480156101ee57600080fd5b5061017961029c565b34801561020357600080fd5b506101796102a2565b34801561021857600080fd5b506101796102a8565b34801561022d57600080fd5b506101026004356102ae565b34801561024557600080fd5b506101026004356102b3565b34801561025d57600080fd5b506101796102b8565b600555565b600155565b600055565b600455565b600255565b60065490565b60005490565b60015490565b600355565b60035490565b60075490565b60025490565b60055490565b600755565b600655565b600454905600a165627a7a72305820c909f1720d7dc3932c9e8fcc4d28cf9e4291543f1040c9d808b3894be964bc230029";

    private Room_sol_Room(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Room_sol_Room(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> setValidEndTime(BigInteger end) {
        Function function = new Function(
                "setValidEndTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(end)), 
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

    public RemoteCall<TransactionReceipt> setRoomId(BigInteger id) {
        Function function = new Function(
                "setRoomId", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setValidStartTime(BigInteger start) {
        Function function = new Function(
                "setValidStartTime", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(start)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setRoomType(byte[] rType) {
        Function function = new Function(
                "setRoomType", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(rType)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getArea() {
        Function function = new Function("getArea", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getRoomId() {
        Function function = new Function("getRoomId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> getLandlordId() {
        Function function = new Function("getLandlordId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setPrice(BigInteger p) {
        Function function = new Function(
                "setPrice", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(p)), 
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

    public RemoteCall<byte[]> getRoomType() {
        Function function = new Function("getRoomType", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<BigInteger> getValidEndTime() {
        Function function = new Function("getValidEndTime", 
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

    public RemoteCall<TransactionReceipt> setArea(BigInteger _area) {
        Function function = new Function(
                "setArea", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_area)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getValidStartTime() {
        Function function = new Function("getValidStartTime", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Room_sol_Room> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _roomId, BigInteger _landlordId, byte[] _roomType, BigInteger _price, BigInteger _validStartTime, BigInteger _validEndTime, BigInteger _area, byte[] _roomAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_roomId), 
                new org.web3j.abi.datatypes.generated.Uint256(_landlordId), 
                new org.web3j.abi.datatypes.generated.Bytes32(_roomType), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.generated.Uint256(_validStartTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_validEndTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_area), 
                new org.web3j.abi.datatypes.generated.Bytes32(_roomAddress)));
        return deployRemoteCall(Room_sol_Room.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Room_sol_Room> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _roomId, BigInteger _landlordId, byte[] _roomType, BigInteger _price, BigInteger _validStartTime, BigInteger _validEndTime, BigInteger _area, byte[] _roomAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_roomId), 
                new org.web3j.abi.datatypes.generated.Uint256(_landlordId), 
                new org.web3j.abi.datatypes.generated.Bytes32(_roomType), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.generated.Uint256(_validStartTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_validEndTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_area), 
                new org.web3j.abi.datatypes.generated.Bytes32(_roomAddress)));
        return deployRemoteCall(Room_sol_Room.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Room_sol_Room load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Room_sol_Room(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Room_sol_Room load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Room_sol_Room(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
