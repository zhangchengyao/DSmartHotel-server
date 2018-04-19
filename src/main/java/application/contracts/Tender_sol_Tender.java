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
public final class Tender_sol_Tender extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516105b13803806105b1833981016040908152815160208301519183015160608401516000838155908501805193959290920192829190811061005257fe5b6020908102909101015160019081558151829190811061006e57fe5b6020908102909101015160029081558151829190811061008a57fe5b602090810290910101516003558151829060009081106100a657fe5b602090810290910101516004558051819060039081106100c257fe5b602090810290910101516005558051819060049081106100de57fe5b602090810290910101516006558151829060019081106100fa57fe5b6020908102909101015160075581518290600290811061011657fe5b60209081029091010151600855600983905580518190600590811061013757fe5b60209081029091010151600a5581518290600390811061015357fe5b60209081029091010151600b5581518290600490811061016f57fe5b60209081029091010151600c55505050506104228061018f6000396000f30060806040526004361061013d5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166311b5e48681146101425780631ed391961461016957806322f2036f1461017e5780632393aa1b146101985780632ed988d3146101b057806337f9cf20146101c557806338fe5c8c146101dd5780633e0a322d146101f257806347bcc7411461020a5780636e27dc3e146102225780637cd87ba21461023a578063808114201461024f578063823b8ba21461026757806391b7f5ed1461027c57806398d5fdca146102945780639ed9495a146102a95780639fa89030146102be5780639fdc8e8f146102d3578063c1adfb0a146102eb578063c4b3186914610300578063c828371e14610315578063ca87b54c1461032a578063df1f16ec14610342578063e874eaaa1461035a575b600080fd5b34801561014e57600080fd5b50610157610372565b60408051918252519081900360200190f35b34801561017557600080fd5b50610157610378565b34801561018a57600080fd5b5061019660043561037e565b005b3480156101a457600080fd5b50610196600435610383565b3480156101bc57600080fd5b50610157610388565b3480156101d157600080fd5b5061019660043561038e565b3480156101e957600080fd5b50610157610393565b3480156101fe57600080fd5b50610196600435610399565b34801561021657600080fd5b5061019660043561039e565b34801561022e57600080fd5b506101966004356103a3565b34801561024657600080fd5b506101576103a8565b34801561025b57600080fd5b506101966004356103ae565b34801561027357600080fd5b506101576103b3565b34801561028857600080fd5b506101966004356103b9565b3480156102a057600080fd5b506101576103be565b3480156102b557600080fd5b506101576103c4565b3480156102ca57600080fd5b506101576103ca565b3480156102df57600080fd5b506101966004356103d0565b3480156102f757600080fd5b506101576103d5565b34801561030c57600080fd5b506101576103db565b34801561032157600080fd5b506101576103e1565b34801561033657600080fd5b506101966004356103e7565b34801561034e57600080fd5b506101966004356103ec565b34801561036657600080fd5b506101966004356103f1565b60065490565b600c5490565b600055565b600c55565b60005490565b600b55565b60095490565b600555565b600955565b600a55565b600a5490565b600755565b60085490565b600355565b60035490565b60045490565b60025490565b600855565b60075490565b600b5490565b60055490565b600455565b600655565b6002555600a165627a7a72305820d0f1ed140c1dc0bb2ae521699ad5732b19d62912f43085bbfa239be4d0cc9ba80029";

    private Tender_sol_Tender(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Tender_sol_Tender(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
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

    public RemoteCall<TransactionReceipt> setTenderId(BigInteger id) {
        Function function = new Function(
                "setTenderId", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setAroundSite(byte[] around) {
        Function function = new Function(
                "setAroundSite", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(around)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getTenderId() {
        Function function = new Function("getTenderId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
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

    public static RemoteCall<Tender_sol_Tender> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _tenderId, BigInteger _roomNum, List<byte[]> _otherStrInfo, List<BigInteger> _otherIntInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tenderId), 
                new org.web3j.abi.datatypes.generated.Uint256(_roomNum), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherStrInfo, org.web3j.abi.datatypes.generated.Bytes32.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_otherIntInfo, org.web3j.abi.datatypes.generated.Uint256.class))));
        return deployRemoteCall(Tender_sol_Tender.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Tender_sol_Tender> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _tenderId, BigInteger _roomNum, List<byte[]> _otherStrInfo, List<BigInteger> _otherIntInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_tenderId), 
                new org.web3j.abi.datatypes.generated.Uint256(_roomNum), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherStrInfo, org.web3j.abi.datatypes.generated.Bytes32.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_otherIntInfo, org.web3j.abi.datatypes.generated.Uint256.class))));
        return deployRemoteCall(Tender_sol_Tender.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Tender_sol_Tender load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Tender_sol_Tender(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Tender_sol_Tender load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Tender_sol_Tender(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
