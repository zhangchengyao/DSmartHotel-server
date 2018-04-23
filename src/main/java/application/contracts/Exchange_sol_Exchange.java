package application.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
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
public final class Exchange_sol_Exchange extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506101a5806100206000396000f30060806040526004361061004b5763ffffffff7c0100000000000000000000000000000000000000000000000000000000600035041663410085df811461004d578063a838b6e31461004d575b005b34801561005957600080fd5b5061006d6100683660046100f3565b610083565b60405161007a919061013c565b60405180910390f35b60405160009073ffffffffffffffffffffffffffffffffffffffff84169083156108fc0290849084818181858888f193505050501580156100c8573d6000803e3d6000fd5b50600190505b92915050565b60006100e0823561014f565b9392505050565b60006100e08235610168565b6000806040838503121561010657600080fd5b600061011285856100d4565b9250506020610123858286016100e7565b9150509250929050565b6101368161014a565b82525050565b602081016100ce828461012d565b151590565b73ffffffffffffffffffffffffffffffffffffffff1690565b905600a265627a7a723058203cc75abd535f5b66f9d0dbdba2d0bfe9672741854b8fbeee8a48598490edcd4f6c6578706572696d656e74616cf50037";

    private Exchange_sol_Exchange(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Exchange_sol_Exchange(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> refund(String _payer, BigInteger _amout) {
        Function function = new Function(
                "refund", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_payer), 
                new org.web3j.abi.datatypes.generated.Uint256(_amout)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> confirmPayment(String _receiver, BigInteger _amout) {
        Function function = new Function(
                "confirmPayment", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_receiver), 
                new org.web3j.abi.datatypes.generated.Uint256(_amout)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Exchange_sol_Exchange> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Exchange_sol_Exchange.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Exchange_sol_Exchange> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Exchange_sol_Exchange.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static Exchange_sol_Exchange load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Exchange_sol_Exchange(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Exchange_sol_Exchange load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Exchange_sol_Exchange(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
