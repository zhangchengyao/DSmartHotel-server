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
public final class User_sol_User extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b5060405161051438038061051483398101604090815281516020808401519284015160008390559284018051929490930191610052916001919085019061006f565b50805161006690600290602084019061006f565b5050505061010a565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100b057805160ff19168380011785556100dd565b828001600101855582156100dd579182015b828111156100dd5782518255916020019190600101906100c2565b506100e99291506100ed565b5090565b61010791905b808211156100e957600081556001016100f3565b90565b6103fb806101196000396000f3006080604052600436106100775763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166317d7de7c811461007c578063290bb453146101065780635d1ca63114610161578063c47f002714610188578063cc8e2394146101e1578063d0e0ba95146101f6575b600080fd5b34801561008857600080fd5b5061009161020e565b6040805160208082528351818301528351919283929083019185019080838360005b838110156100cb5781810151838201526020016100b3565b50505050905090810190601f1680156100f85780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561011257600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261015f9436949293602493928401919081908401838280828437509497506102a49650505050505050565b005b34801561016d57600080fd5b506101766102bb565b60408051918252519081900360200190f35b34801561019457600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261015f9436949293602493928401919081908401838280828437509497506102c19650505050505050565b3480156101ed57600080fd5b506100916102d4565b34801561020257600080fd5b5061015f600435610332565b60018054604080516020601f600260001961010087891615020190951694909404938401819004810282018101909252828152606093909290918301828280156102995780601f1061026e57610100808354040283529160200191610299565b820191906000526020600020905b81548152906001019060200180831161027c57829003601f168201915b505050505090505b90565b80516102b7906002906020840190610337565b5050565b60005490565b80516102b7906001906020840190610337565b60028054604080516020601f60001961010060018716150201909416859004938401819004810282018101909252828152606093909290918301828280156102995780601f1061026e57610100808354040283529160200191610299565b600055565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061037857805160ff19168380011785556103a5565b828001600101855582156103a5579182015b828111156103a557825182559160200191906001019061038a565b506103b19291506103b5565b5090565b6102a191905b808211156103b157600081556001016103bb5600a165627a7a723058200c73df266a1b2f48906e0ccf0988c6ce8d27a08d327faa2e23f624e9431a3c2d0029";

    private User_sol_User(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private User_sol_User(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> getName() {
        Function function = new Function("getName", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setPassword(String pw) {
        Function function = new Function(
                "setPassword", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(pw)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getId() {
        Function function = new Function("getId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setName(String _name) {
        Function function = new Function(
                "setName", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getPassword() {
        Function function = new Function("getPassword", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setId(BigInteger _id) {
        Function function = new Function(
                "setId", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<User_sol_User> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, String _name, String _password) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_password)));
        return deployRemoteCall(User_sol_User.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<User_sol_User> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, String _name, String _password) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_password)));
        return deployRemoteCall(User_sol_User.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static User_sol_User load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new User_sol_User(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static User_sol_User load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new User_sol_User(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
