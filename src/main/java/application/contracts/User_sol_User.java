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
import org.web3j.abi.datatypes.Utf8String;
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
public final class User_sol_User extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50604051606080610895833981018060405261002f9190810190610053565b6000929092556001556002556100a3565b600061004c82516100a0565b9392505050565b60008060006060848603121561006857600080fd5b60006100748686610040565b935050602061008586828701610040565b925050604061009686828701610040565b9150509250925092565b90565b6107e3806100b26000396000f3006080604052600436106100985763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630981ca98811461009a57806317d7de7c146100ba5780635ac801fe146100e55780635d1ca631146101055780639f3915441461011a578063c40768761461013a578063cc8e239414610167578063d0e0ba951461017c578063f64a8b801461019c575b005b3480156100a657600080fd5b506100986100b536600461058f565b6101be565b3480156100c657600080fd5b506100cf6101d5565b6040516100dc91906106bd565b60405180910390f35b3480156100f157600080fd5b506100986101003660046105cc565b6101dc565b34801561011157600080fd5b506100cf6101e1565b34801561012657600080fd5b506100986101353660046105cc565b6101e7565b34801561014657600080fd5b5061015a610155366004610555565b6101ec565b6040516100dc91906106af565b34801561017357600080fd5b506100cf61023d565b34801561018857600080fd5b506100986101973660046105cc565b610243565b3480156101a857600080fd5b506101b1610248565b6040516100dc919061069e565b80516101d1906003906020840190610320565b5050565b6001545b90565b600155565b60005490565b600255565b60405160009073ffffffffffffffffffffffffffffffffffffffff84169083156108fc0290849084818181858888f19350505050158015610231573d6000803e3d6000fd5b50600190505b92915050565b60025490565b600055565b60606003805480602002602001604051908101604052809291908181526020016000905b828210156103175760008481526020908190208301805460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152928301828280156103035780601f106102d857610100808354040283529160200191610303565b820191906000526020600020905b8154815290600101906020018083116102e657829003601f168201915b50505050508152602001906001019061026c565b50505050905090565b82805482825590600052602060002090810192821561036d579160200282015b8281111561036d578251805161035d91849160209091019061037d565b5091602001919060010190610340565b506103799291506103f7565b5090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106103be57805160ff19168380011785556103eb565b828001600101855582156103eb579182015b828111156103eb5782518255916020019190600101906103d0565b5061037992915061041a565b6101d991905b808211156103795760006104118282610434565b506001016103fd565b6101d991905b808211156103795760008155600101610420565b50805460018160011615610100020316600290046000825580601f1061045a5750610478565b601f016020900490600052602060002090810190610478919061041a565b50565b6000610487823561074a565b9392505050565b6000601f8201831361049f57600080fd5b81356104b26104ad826106f2565b6106cb565b81815260209384019390925082018360005b838110156104f057813586016104da8882610506565b84525060209283019291909101906001016104c4565b5050505092915050565b600061048782356101d9565b6000601f8201831361051757600080fd5b81356105256104ad82610713565b9150808252602083016020830185838301111561054157600080fd5b61054c838284610763565b50505092915050565b6000806040838503121561056857600080fd5b6000610574858561047b565b9250506020610585858286016104fa565b9150509250929050565b6000602082840312156105a157600080fd5b813567ffffffffffffffff8111156105b857600080fd5b6105c48482850161048e565b949350505050565b6000602082840312156105de57600080fd5b60006105c484846104fa565b60006105f582610741565b8084526020840193508360208202850161060e8561073b565b60005b84811015610645578383038852610629838351610669565b92506106348261073b565b602098909801979150600101610611565b50909695505050505050565b61065a81610745565b82525050565b61065a816101d9565b600061067482610741565b80845261068881602086016020860161076f565b6106918161079f565b9093016020019392505050565b6020808252810161048781846105ea565b602081016102378284610651565b602081016102378284610660565b60405181810167ffffffffffffffff811182821017156106ea57600080fd5b604052919050565b600067ffffffffffffffff82111561070957600080fd5b5060209081020190565b600067ffffffffffffffff82111561072a57600080fd5b506020601f91909101601f19160190565b60200190565b5190565b151590565b73ffffffffffffffffffffffffffffffffffffffff1690565b82818337506000910152565b60005b8381101561078a578181015183820152602001610772565b83811115610799576000848401525b50505050565b601f01601f1916905600a265627a7a72305820ea3d243c326364162c633cd6fccab8bb542fe96ee1dd0930125e2e078d1534066c6578706572696d656e74616cf50037";

    private User_sol_User(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private User_sol_User(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> setChatFilesHashAndName(List<String> _chatFilesHashAndName) {
        Function function = new Function(
                "setChatFilesHashAndName", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Utf8String>(
                        org.web3j.abi.Utils.typeMap(_chatFilesHashAndName, org.web3j.abi.datatypes.Utf8String.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getName() {
        Function function = new Function("getName", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setName(byte[] _name) {
        Function function = new Function(
                "setName", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getId() {
        Function function = new Function("getId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setPassword(byte[] _password) {
        Function function = new Function(
                "setPassword", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_password)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> pay(String _exchange, BigInteger _amout) {
        Function function = new Function(
                "pay", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_exchange), 
                new org.web3j.abi.datatypes.generated.Uint256(_amout)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getPassword() {
        Function function = new Function("getPassword", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setId(BigInteger _id) {
        Function function = new Function(
                "setId", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<List> getChatFilesHashAndName() {
        Function function = new Function("getChatFilesHashAndName", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Utf8String>>() {}));
        return executeRemoteCallSingleValueReturn(function, List.class);
    }

    public static RemoteCall<User_sol_User> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, byte[] _name, byte[] _password) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.generated.Bytes32(_name), 
                new org.web3j.abi.datatypes.generated.Bytes32(_password)));
        return deployRemoteCall(User_sol_User.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<User_sol_User> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, byte[] _name, byte[] _password) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.generated.Bytes32(_name), 
                new org.web3j.abi.datatypes.generated.Bytes32(_password)));
        return deployRemoteCall(User_sol_User.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static User_sol_User load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new User_sol_User(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static User_sol_User load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new User_sol_User(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
