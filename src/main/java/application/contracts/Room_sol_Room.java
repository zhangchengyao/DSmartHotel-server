package application.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
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
    private static final String BINARY = "608060405234801561001057600080fd5b506040516106da3803806106da8339810160409081528151602080840151928401516060850151608086015160a087015160c088015160e0890151600088905560018990559489018051979990979496939592949193920191610078916002918901906100ae565b50600385905560048490556005839055600682905580516100a09060079060208401906100ae565b505050505050505050610149565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100ef57805160ff191683800117855561011c565b8280016001018555821561011c579182015b8281111561011c578251825591602001919060010190610101565b5061012892915061012c565b5090565b61014691905b808211156101285760008155600101610132565b90565b610582806101586000396000f3006080604052600436106100e55763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631395986381146100ea57806326357ada14610104578063375fb87a1461015d5780633f051d9b146101755780634acbca7a1461018d57806385be3e62146101a557806386fbd66c146101cc57806389eff133146101e157806391b7f5ed146101f657806398d5fdca1461020e5780639ed9495a14610223578063c1adfb0a146102ad578063c5482c14146102c2578063cf50e603146102d7578063dc4a611c146102ef578063ead4cf0014610348575b600080fd5b3480156100f657600080fd5b5061010260043561035d565b005b34801561011057600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526101029436949293602493928401919081908401838280828437509497506103629650505050505050565b34801561016957600080fd5b50610102600435610379565b34801561018157600080fd5b5061010260043561037e565b34801561019957600080fd5b50610102600435610383565b3480156101b157600080fd5b506101ba610388565b60408051918252519081900360200190f35b3480156101d857600080fd5b506101ba61038f565b3480156101ed57600080fd5b506101ba610395565b34801561020257600080fd5b5061010260043561039b565b34801561021a57600080fd5b506101ba6103a0565b34801561022f57600080fd5b506102386103a6565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561027257818101518382015260200161025a565b50505050905090810190601f16801561029f5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156102b957600080fd5b5061023861043c565b3480156102ce57600080fd5b506101ba61049a565b3480156102e357600080fd5b506101026004356104a0565b3480156102fb57600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526101029436949293602493928401919081908401838280828437509497506104a59650505050505050565b34801561035457600080fd5b506101ba6104b8565b600555565b80516103759060029060208401906104be565b5050565b600155565b600055565b600455565b6006545b90565b60005490565b60015490565b600355565b60035490565b60078054604080516020601f60026000196101006001881615020190951694909404938401819004810282018101909252828152606093909290918301828280156104325780601f1061040757610100808354040283529160200191610432565b820191906000526020600020905b81548152906001019060200180831161041557829003601f168201915b5050505050905090565b60028054604080516020601f60001961010060018716150201909416859004938401819004810282018101909252828152606093909290918301828280156104325780601f1061040757610100808354040283529160200191610432565b60055490565b600655565b80516103759060079060208401906104be565b60045490565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106104ff57805160ff191683800117855561052c565b8280016001018555821561052c579182015b8281111561052c578251825591602001919060010190610511565b5061053892915061053c565b5090565b61038c91905b8082111561053857600081556001016105425600a165627a7a7230582097b3d54df2151671fc805a107c544ed9a1061912b88b2ebb18c2b83ffe694d340029";

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

    public RemoteCall<TransactionReceipt> setRoomType(String rType) {
        Function function = new Function(
                "setRoomType", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(rType)), 
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

    public RemoteCall<String> getRoomAddress() {
        Function function = new Function("getRoomAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getRoomType() {
        Function function = new Function("getRoomType", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getValidEndTime() {
        Function function = new Function("getValidEndTime", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setArea(BigInteger _area) {
        Function function = new Function(
                "setArea", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_area)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setRoomAddress(String rAddress) {
        Function function = new Function(
                "setRoomAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(rAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getValidStartTime() {
        Function function = new Function("getValidStartTime", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public static RemoteCall<Room_sol_Room> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _roomId, BigInteger _landlordId, String _roomType, BigInteger _price, BigInteger _validStartTime, BigInteger _validEndTime, BigInteger _area, String _roomAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_roomId), 
                new org.web3j.abi.datatypes.generated.Uint256(_landlordId), 
                new org.web3j.abi.datatypes.Utf8String(_roomType), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.generated.Uint256(_validStartTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_validEndTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_area), 
                new org.web3j.abi.datatypes.Utf8String(_roomAddress)));
        return deployRemoteCall(Room_sol_Room.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Room_sol_Room> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _roomId, BigInteger _landlordId, String _roomType, BigInteger _price, BigInteger _validStartTime, BigInteger _validEndTime, BigInteger _area, String _roomAddress) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_roomId), 
                new org.web3j.abi.datatypes.generated.Uint256(_landlordId), 
                new org.web3j.abi.datatypes.Utf8String(_roomType), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.generated.Uint256(_validStartTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_validEndTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_area), 
                new org.web3j.abi.datatypes.Utf8String(_roomAddress)));
        return deployRemoteCall(Room_sol_Room.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Room_sol_Room load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Room_sol_Room(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Room_sol_Room load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Room_sol_Room(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
