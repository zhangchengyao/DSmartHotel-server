package application.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
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
public final class Tenant_sol_Tenant extends Contract {
    private static final String BINARY = "60806040523480156200001157600080fd5b50604051620011eb380380620011eb83398101604090815281516020808401519284015160608501516000849055938501805193959094918101939101918591859185916200006791600191908501906200016b565b5080516200007d9060029060208401906200016b565b50505060008590555082516200009b9060019060208601906200016b565b508151620000b19060029060208501906200016b565b50806000815181101515620000c257fe5b60209081029091010151600355805181906001908110620000df57fe5b60209081029091010151600455805181906002908110620000fc57fe5b602090810290910101516005558051819060039081106200011957fe5b602090810290910101516006558051819060049081106200013657fe5b602090810290910101516007558051819060059081106200015357fe5b60209081029091010151600855506200021092505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10620001ae57805160ff1916838001178555620001de565b82800160010185558215620001de579182015b82811115620001de578251825591602001919060010190620001c1565b50620001ec929150620001f0565b5090565b6200020d91905b80821115620001ec5760008155600101620001f7565b90565b610fcb80620002206000396000f3006080604052600436106101275763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166317d7de7c811461012c5780631c41e2db146101b6578063290bb453146101dd57806331c079f3146102385780633ae9a2d71461024d5780635d1ca631146102655780635efc088e1461027a578063689aa6551461028f57806376f75e7f146102a75780637bea0d1c146102e85780637c38a8c31461034d5780638f4f00f614610362578063ad6737131461037a578063b4aadd7d1461041a578063b5c18adf14610432578063c47f002714610447578063cc8e2394146104a0578063d0e0ba95146104b5578063d18d4915146104cd578063f1277648146104e5578063ff056d39146104fd578063ffe8cf4814610515575b600080fd5b34801561013857600080fd5b5061014161052a565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561017b578181015183820152602001610163565b50505050905090810190601f1680156101a85780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156101c257600080fd5b506101cb6105c0565b60408051918252519081900360200190f35b3480156101e957600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526102369436949293602493928401919081908401838280828437509497506105c69650505050505050565b005b34801561024457600080fd5b506101cb6105dd565b34801561025957600080fd5b506102366004356105e3565b34801561027157600080fd5b506101cb6105e8565b34801561028657600080fd5b506101cb6105ee565b34801561029b57600080fd5b506102366004356105f4565b3480156102b357600080fd5b506102bf6004356105f9565b6040805173ffffffffffffffffffffffffffffffffffffffff9092168252519081900360200190f35b3480156102f457600080fd5b506102fd61062e565b60408051602080825283518183015283519192839290830191858101910280838360005b83811015610339578181015183820152602001610321565b505050509050019250505060405180910390f35b34801561035957600080fd5b506101cb61069c565b34801561036e57600080fd5b506102366004356106a2565b34801561038657600080fd5b50604080516064356004818101356020818102858101820190965281855261023695833595602480359660ff60443516963696909560849592909301929091829185019084908082843750506040805187358901803560208181028481018201909552818452989b9a9989019892975090820195509350839250850190849080828437509497506106a79650505050505050565b34801561042657600080fd5b506102bf60043561084b565b34801561043e57600080fd5b506101cb610873565b34801561045357600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526102369436949293602493928401919081908401838280828437509497506108799650505050505050565b3480156104ac57600080fd5b5061014161088c565b3480156104c157600080fd5b506102366004356108ea565b3480156104d957600080fd5b506102366004356108ef565b3480156104f157600080fd5b506102366004356108f4565b34801561050957600080fd5b506102366004356108f9565b34801561052157600080fd5b506101cb6108fe565b60018054604080516020601f600260001961010087891615020190951694909404938401819004810282018101909252828152606093909290918301828280156105b55780601f1061058a576101008083540402835291602001916105b5565b820191906000526020600020905b81548152906001019060200180831161059857829003601f168201915b505050505090505b90565b60065490565b80516105d9906002906020840190610904565b5050565b60045490565b600455565b60005490565b60085490565b600355565b600a80548290811061060757fe5b60009182526020909120015473ffffffffffffffffffffffffffffffffffffffff16905081565b6060600a8054806020026020016040519081016040528092919081815260200182805480156105b557602002820191906000526020600020905b815473ffffffffffffffffffffffffffffffffffffffff168152600190910190602001808311610668575050505050905090565b60035490565b600555565b600085858585856106b6610982565b808681526020018581526020018460ff1660ff1681526020018060200180602001838103835285818151815260200191508051906020019060200280838360005b8381101561070f5781810151838201526020016106f7565b50505050905001838103825284818151815260200191508051906020019060200280838360005b8381101561074e578181015183820152602001610736565b50505050905001975050505050505050604051809103906000f08015801561077a573d6000803e3d6000fd5b50600a805460018101825560008290527fc65a7bb8d6351c1cf70c95a316cc6a92839c986682d98bc35f958f4883f9d2a801805473ffffffffffffffffffffffffffffffffffffffff191673ffffffffffffffffffffffffffffffffffffffff841617905580549192509060001981019081106107f357fe5b60009182526020808320909101549782526009905260409020805473ffffffffffffffffffffffffffffffffffffffff191673ffffffffffffffffffffffffffffffffffffffff909716969096179095555050505050565b60096020526000908152604090205473ffffffffffffffffffffffffffffffffffffffff1681565b60055490565b80516105d9906001906020840190610904565b60028054604080516020601f60001961010060018716150201909416859004938401819004810282018101909252828152606093909290918301828280156105b55780601f1061058a576101008083540402835291602001916105b5565b600055565b600755565b600855565b600655565b60075490565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061094557805160ff1916838001178555610972565b82800160010185558215610972579182015b82811115610972578251825591602001919060010190610957565b5061097e929150610992565b5090565b6040516105f3806109ad83390190565b6105bd91905b8082111561097e57600081556001016109985600608060405234801561001057600080fd5b506040516105f33803806105f383398101604090815281516020830151918301516060840151608085015160008481556001869055918601805194969394909391909101918391811061005f57fe5b6020908102909101015160025581518290600190811061007b57fe5b6020908102909101015160035581518290600290811061009757fe5b602090810290910101516004558051819060009081106100b357fe5b602090810290910101516005558051819060019081106100cf57fe5b602090810290910101516006558051819060029081106100eb57fe5b6020908102909101015160075580518190600390811061010757fe5b6020908102909101015160085581518290600390811061012357fe5b6020908102909101015160095581518290600490811061013f57fe5b60209081029091010151600a5560ff8316600b5580518190600490811061016257fe5b60209081029091010151600c555050505050610470806101836000396000f3006080604052600436106101535763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166311b5e48681146101585780631ed391961461017f5780632393aa1b1461019457806331b3202c146101ae578063375fb87a146101c657806337f9cf20146101de57806338fe5c8c146101f65780633e0a322d1461020b57806347bcc741146102235780636e27dc3e1461023b5780637cd87ba2146102535780638081142014610268578063823b8ba21461028057806389eff1331461029557806391b7f5ed146102aa57806398d5fdca146102c25780639ed9495a146102d75780639fa89030146102ec5780639fdc8e8f14610301578063a849642614610319578063c1adfb0a1461032e578063c4b3186914610343578063c828371e14610358578063ca87b54c1461036d578063df1f16ec14610385578063e874eaaa1461039d575b600080fd5b34801561016457600080fd5b5061016d6103b5565b60408051918252519081900360200190f35b34801561018b57600080fd5b5061016d6103bb565b3480156101a057600080fd5b506101ac6004356103c1565b005b3480156101ba57600080fd5b506101ac6004356103c6565b3480156101d257600080fd5b506101ac6004356103cb565b3480156101ea57600080fd5b506101ac6004356103d0565b34801561020257600080fd5b5061016d6103d5565b34801561021757600080fd5b506101ac6004356103db565b34801561022f57600080fd5b506101ac6004356103e0565b34801561024757600080fd5b506101ac6004356103e5565b34801561025f57600080fd5b5061016d6103ea565b34801561027457600080fd5b506101ac6004356103f0565b34801561028c57600080fd5b5061016d6103f5565b3480156102a157600080fd5b5061016d6103fb565b3480156102b657600080fd5b506101ac600435610401565b3480156102ce57600080fd5b5061016d610406565b3480156102e357600080fd5b5061016d61040c565b3480156102f857600080fd5b5061016d610412565b34801561030d57600080fd5b506101ac600435610418565b34801561032557600080fd5b5061016d61041d565b34801561033a57600080fd5b5061016d610423565b34801561034f57600080fd5b5061016d610429565b34801561036457600080fd5b5061016d61042f565b34801561037957600080fd5b506101ac600435610435565b34801561039157600080fd5b506101ac60043561043a565b3480156103a957600080fd5b506101ac60043561043f565b600a5490565b60085490565b600855565b600055565b600255565b600555565b600b5490565b600955565b600b55565b600455565b60045490565b600655565b60075490565b60025490565b600355565b60035490565b600c5490565b60015490565b600755565b60005490565b60065490565b60055490565b60095490565b600c55565b600a55565b6001555600a165627a7a72305820b47df366ab94ee713730fdc166988d3502b4e330874a1543acafa44b733dff5c0029a165627a7a72305820875d64ab94704dd13ab380072f4eda67a4204318e650570728ba66789fbfd27a0029";

    private Tenant_sol_Tenant(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Tenant_sol_Tenant(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<String> getName() {
        Function function = new Function("getName", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> getEducation() {
        Function function = new Function("getEducation", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setPassword(String pw) {
        Function function = new Function(
                "setPassword", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(pw)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getPhoneNum() {
        Function function = new Function("getPhoneNum", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setPhoneNum(byte[] phone) {
        Function function = new Function(
                "setPhoneNum", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(phone)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getId() {
        Function function = new Function("getId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> getEconomic() {
        Function function = new Function("getEconomic", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setGender(byte[] gen) {
        Function function = new Function(
                "setGender", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(gen)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> orderList(BigInteger param0) {
        Function function = new Function("orderList", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<List<String>> getAllOrders() {
        Function function = new Function("getAllOrders", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return executeRemoteCallSingleValueReturn(function, List<String>.class);
    }

    public RemoteCall<byte[]> getGender() {
        Function function = new Function("getGender", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setPreference(byte[] pre) {
        Function function = new Function(
                "setPreference", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(pre)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> createOrder(BigInteger _orderId, BigInteger _tenantId, BigInteger _roomNum, List<BigInteger> _otherIntInfo, List<byte[]> _otherStrInfo) {
        Function function = new Function(
                "createOrder", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_orderId), 
                new org.web3j.abi.datatypes.generated.Uint256(_tenantId), 
                new org.web3j.abi.datatypes.generated.Uint8(_roomNum), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_otherIntInfo, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherStrInfo, org.web3j.abi.datatypes.generated.Bytes32.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> orderMapping(BigInteger param0) {
        Function function = new Function("orderMapping", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> getPreference() {
        Function function = new Function("getPreference", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
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

    public RemoteCall<TransactionReceipt> setVocation(byte[] vc) {
        Function function = new Function(
                "setVocation", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(vc)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setEconomic(byte[] ec) {
        Function function = new Function(
                "setEconomic", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(ec)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setEducation(byte[] edu) {
        Function function = new Function(
                "setEducation", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(edu)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getVocation() {
        Function function = new Function("getVocation", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public static RemoteCall<Tenant_sol_Tenant> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, String _name, String _password, List<byte[]> _otherInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_password), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherInfo, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Tenant_sol_Tenant.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Tenant_sol_Tenant> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, String _name, String _password, List<byte[]> _otherInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_password), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherInfo, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Tenant_sol_Tenant.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Tenant_sol_Tenant load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Tenant_sol_Tenant(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Tenant_sol_Tenant load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Tenant_sol_Tenant(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
