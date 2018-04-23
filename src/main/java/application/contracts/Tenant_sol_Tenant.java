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
    private static final String BINARY = "60806040523480156200001157600080fd5b506040516200193f3803806200193f83398101806040526200003791908101906200019b565b600084815560018490556002839055815182919081106200005457fe5b602090810290910101516004558051819060019081106200007157fe5b602090810290910101516005558051819060029081106200008e57fe5b60209081029091010151600655805181906003908110620000ab57fe5b60209081029091010151600755805181906004908110620000c857fe5b60209081029091010151600855805181906005908110620000e557fe5b60209081029091010151600955506200026892505050565b6000601f820183136200010f57600080fd5b815162000126620001208262000244565b6200021d565b915081818352602084019350602081019050838560208402820111156200014c57600080fd5b60005b838110156200017c578162000165888262000186565b84525060209283019291909101906001016200014f565b5050505092915050565b600062000194825162000265565b9392505050565b60008060008060808587031215620001b257600080fd5b6000620001c0878762000186565b9450506020620001d38782880162000186565b9350506040620001e68782880162000186565b92505060608501516001604060020a038111156200020357600080fd5b6200021187828801620000fd565b91505092959194509250565b6040518181016001604060020a03811182821017156200023c57600080fd5b604052919050565b60006001604060020a038211156200025b57600080fd5b5060209081020190565b90565b6116c780620002786000396000f3006080604052600436106200016e5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630981ca9881146200017057806317d7de7c14620001955780631c41e2db14620001c557806331c079f314620001dd5780633ae9a2d714620001f55780635ac801fe146200021a5780635d1ca631146200023f5780635efc088e1462000257578063689aa655146200026f57806376f75e7f14620002945780637bea0d1c14620002c85780637c38a8c314620002ef5780638f4f00f614620003075780639f391544146200032c578063ad6737131462000351578063b4aadd7d1462000376578063b5c18adf146200039b578063c407687614620003b3578063cc8e239414620003e7578063d09ef24114620003ff578063d0e0ba951462000424578063d18d49151462000449578063f1277648146200046e578063f64a8b801462000493578063ff056d3914620004ba578063ffe8cf4814620004df575b005b3480156200017d57600080fd5b506200016e6200018f36600462000c03565b620004f7565b348015620001a257600080fd5b50620001ad62000510565b604051620001bc919062000f4a565b60405180910390f35b348015620001d257600080fd5b50620001ad62000517565b348015620001ea57600080fd5b50620001ad6200051d565b3480156200020257600080fd5b506200016e6200021436600462000c44565b62000523565b3480156200022757600080fd5b506200016e6200023936600462000c44565b62000528565b3480156200024c57600080fd5b50620001ad6200052d565b3480156200026457600080fd5b50620001ad62000533565b3480156200027c57600080fd5b506200016e6200028e36600462000c44565b62000539565b348015620002a157600080fd5b50620002b9620002b336600462000c44565b6200053e565b604051620001bc919062000f04565b348015620002d557600080fd5b50620002e062000567565b604051620001bc919062000f14565b348015620002fc57600080fd5b50620001ad620005cb565b3480156200031457600080fd5b506200016e6200032636600462000c44565b620005d1565b3480156200033957600080fd5b506200016e6200034b36600462000c44565b620005d6565b3480156200035e57600080fd5b506200016e6200037036600462000c65565b620005db565b3480156200038357600080fd5b50620002b96200039536600462000c44565b620006d1565b348015620003a857600080fd5b50620001ad620006ec565b348015620003c057600080fd5b50620003d8620003d236600462000bc4565b620006f2565b604051620001bc919062000f3a565b348015620003f457600080fd5b50620001ad62000737565b3480156200040c57600080fd5b50620002b96200041e36600462000c44565b6200073d565b3480156200043157600080fd5b506200016e6200044336600462000c44565b62000758565b3480156200045657600080fd5b506200016e6200046836600462000c44565b6200075d565b3480156200047b57600080fd5b506200016e6200048d36600462000c44565b62000762565b348015620004a057600080fd5b50620004ab62000767565b604051620001bc919062000f27565b348015620004c757600080fd5b506200016e620004d936600462000c44565b62000845565b348015620004ec57600080fd5b50620001ad6200084a565b80516200050c90600390602084019062000850565b5050565b6001545b90565b60075490565b60055490565b600555565b600155565b60005490565b60095490565b600455565b600b8054829081106200054d57fe5b600091825260209091200154600160a060020a0316905081565b6060600b805480602002602001604051908101604052809291908181526020018280548015620005c157602002820191906000526020600020905b8154600160a060020a03168152600190910190602001808311620005a2575b5050505050905090565b60045490565b600655565b600255565b60008585858585620005ec620008b4565b620005fc95949392919062000f5a565b604051809103906000f08015801562000619573d6000803e3d6000fd5b50600b805460018101825560008290527f0175b7a638427703f0dbe7bb9bbf987a2551717b34e79f33b5b1008d1fa01db901805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03841617905580549192509060001981019081106200068657fe5b6000918252602080832090910154978252600a905260409020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03909716969096179095555050505050565b600a60205260009081526040902054600160a060020a031681565b60065490565b604051600090600160a060020a0384169083156108fc0290849084818181858888f193505050501580156200072b573d6000803e3d6000fd5b50600190505b92915050565b60025490565b6000908152600a6020526040902054600160a060020a031690565b600055565b600855565b600955565b60606003805480602002602001604051908101604052809291908181526020016000905b828210156200083c5760008481526020908190208301805460408051601f6002600019610100600187161502019094169390930492830185900485028101850190915281815292830182828015620008275780601f10620007fb5761010080835404028352916020019162000827565b820191906000526020600020905b8154815290600101906020018083116200080957829003601f168201915b5050505050815260200190600101906200078b565b50505050905090565b600755565b60085490565b828054828255906000526020600020908101928215620008a2579160200282015b82811115620008a2578251805162000891918491602090910190620008c5565b509160200191906001019062000871565b50620008b092915062000946565b5090565b6040516105f3806200109b83390190565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200090857805160ff191683800117855562000938565b8280016001018555821562000938579182015b82811115620009385782518255916020019190600101906200091b565b50620008b09291506200096e565b6200051491905b80821115620008b05760006200096482826200098b565b506001016200094d565b6200051491905b80821115620008b0576000815560010162000975565b50805460018160011615610100020316600290046000825580601f10620009b35750620009d3565b601f016020900490600052602060002090810190620009d391906200096e565b50565b6000620009e482356200103a565b9392505050565b6000601f82018313620009fd57600080fd5b813562000a1462000a0e8262000fe5565b62000fbd565b9150818183526020840193506020810190508385602084028201111562000a3a57600080fd5b60005b8381101562000a6a578162000a53888262000b52565b845250602092830192919091019060010162000a3d565b5050505092915050565b6000601f8201831362000a8657600080fd5b813562000a9762000a0e8262000fe5565b81815260209384019390925082018360005b8381101562000a6a578135860162000ac2888262000b60565b845250602092830192919091019060010162000aa9565b6000601f8201831362000aeb57600080fd5b813562000afc62000a0e8262000fe5565b9150818183526020840193506020810190508385602084028201111562000b2257600080fd5b60005b8381101562000a6a578162000b3b888262000b52565b845250602092830192919091019060010162000b25565b6000620009e4823562000514565b6000601f8201831362000b7257600080fd5b813562000b8362000a0e8262001007565b9150808252602083016020830185838301111562000ba057600080fd5b62000bad83828462001051565b50505092915050565b6000620009e482356200104b565b6000806040838503121562000bd857600080fd5b600062000be68585620009d6565b925050602062000bf98582860162000b52565b9150509250929050565b60006020828403121562000c1657600080fd5b813567ffffffffffffffff81111562000c2e57600080fd5b62000c3c8482850162000a74565b949350505050565b60006020828403121562000c5757600080fd5b600062000c3c848462000b52565b600080600080600060a0868803121562000c7e57600080fd5b600062000c8c888862000b52565b955050602062000c9f8882890162000b52565b945050604062000cb28882890162000bb6565b935050606086013567ffffffffffffffff81111562000cd057600080fd5b62000cde8882890162000ad9565b925050608086013567ffffffffffffffff81111562000cfc57600080fd5b62000d0a88828901620009eb565b9150509295509295909350565b62000d22816200103a565b82525050565b600062000d358262001036565b80845260208401935062000d498362001030565b60005b8281101562000d7f5762000d6286835162000d17565b62000d6d8262001030565b60209690960195915060010162000d4c565b5093949350505050565b600062000d968262001036565b80845260208401935062000daa8362001030565b60005b8281101562000d7f5762000dc386835162000eb3565b62000dce8262001030565b60209690960195915060010162000dad565b600062000ded8262001036565b8084526020840193508360208202850162000e088562001030565b60005b8481101562000e4557838303885262000e2683835162000ebe565b925062000e338262001030565b60209890980197915060010162000e0b565b50909695505050505050565b600062000e5e8262001036565b80845260208401935062000e728362001030565b60005b8281101562000d7f5762000e8b86835162000eb3565b62000e968262001030565b60209690960195915060010162000e75565b62000d228162001046565b62000d228162000514565b600062000ecb8262001036565b80845262000ee18160208601602086016200105d565b62000eec8162001090565b9093016020019392505050565b62000d22816200104b565b6020810162000731828462000d17565b60208082528101620009e4818462000d28565b60208082528101620009e4818462000de0565b6020810162000731828462000ea8565b6020810162000731828462000eb3565b60a0810162000f6a828862000eb3565b62000f79602083018762000eb3565b62000f88604083018662000ef9565b818103606083015262000f9c818562000e51565b9050818103608083015262000fb2818462000d89565b979650505050505050565b60405181810167ffffffffffffffff8111828210171562000fdd57600080fd5b604052919050565b600067ffffffffffffffff82111562000ffd57600080fd5b5060209081020190565b600067ffffffffffffffff8211156200101f57600080fd5b506020601f91909101601f19160190565b60200190565b5190565b600160a060020a031690565b151590565b60ff1690565b82818337506000910152565b60005b838110156200107a57818101518382015260200162001060565b838111156200108a576000848401525b50505050565b601f01601f1916905600608060405234801561001057600080fd5b506040516105f33803806105f383398101604090815281516020830151918301516060840151608085015160008481556001869055918601805194969394909391909101918391811061005f57fe5b6020908102909101015160025581518290600190811061007b57fe5b6020908102909101015160035581518290600290811061009757fe5b602090810290910101516004558051819060009081106100b357fe5b602090810290910101516005558051819060019081106100cf57fe5b602090810290910101516006558051819060029081106100eb57fe5b6020908102909101015160075580518190600390811061010757fe5b6020908102909101015160085581518290600390811061012357fe5b6020908102909101015160095581518290600490811061013f57fe5b60209081029091010151600a5560ff8316600b5580518190600490811061016257fe5b60209081029091010151600c555050505050610470806101836000396000f3006080604052600436106101535763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166311b5e48681146101585780631ed391961461017f5780632393aa1b1461019457806331b3202c146101ae578063375fb87a146101c657806337f9cf20146101de57806338fe5c8c146101f65780633e0a322d1461020b57806347bcc741146102235780636e27dc3e1461023b5780637cd87ba2146102535780638081142014610268578063823b8ba21461028057806389eff1331461029557806391b7f5ed146102aa57806398d5fdca146102c25780639ed9495a146102d75780639fa89030146102ec5780639fdc8e8f14610301578063a849642614610319578063c1adfb0a1461032e578063c4b3186914610343578063c828371e14610358578063ca87b54c1461036d578063df1f16ec14610385578063e874eaaa1461039d575b600080fd5b34801561016457600080fd5b5061016d6103b5565b60408051918252519081900360200190f35b34801561018b57600080fd5b5061016d6103bb565b3480156101a057600080fd5b506101ac6004356103c1565b005b3480156101ba57600080fd5b506101ac6004356103c6565b3480156101d257600080fd5b506101ac6004356103cb565b3480156101ea57600080fd5b506101ac6004356103d0565b34801561020257600080fd5b5061016d6103d5565b34801561021757600080fd5b506101ac6004356103db565b34801561022f57600080fd5b506101ac6004356103e0565b34801561024757600080fd5b506101ac6004356103e5565b34801561025f57600080fd5b5061016d6103ea565b34801561027457600080fd5b506101ac6004356103f0565b34801561028c57600080fd5b5061016d6103f5565b3480156102a157600080fd5b5061016d6103fb565b3480156102b657600080fd5b506101ac600435610401565b3480156102ce57600080fd5b5061016d610406565b3480156102e357600080fd5b5061016d61040c565b3480156102f857600080fd5b5061016d610412565b34801561030d57600080fd5b506101ac600435610418565b34801561032557600080fd5b5061016d61041d565b34801561033a57600080fd5b5061016d610423565b34801561034f57600080fd5b5061016d610429565b34801561036457600080fd5b5061016d61042f565b34801561037957600080fd5b506101ac600435610435565b34801561039157600080fd5b506101ac60043561043a565b3480156103a957600080fd5b506101ac60043561043f565b600a5490565b60085490565b600855565b600055565b600255565b600555565b600b5490565b600955565b600b55565b600455565b60045490565b600655565b60075490565b60025490565b600355565b60035490565b600c5490565b60015490565b600755565b60005490565b60065490565b60055490565b60095490565b600c55565b600a55565b6001555600a165627a7a723058206a168c69ac2add0e3a55ea067f35c21ec0281296c3c59fbb2ce5036cf79aa4960029a265627a7a7230582064c94e726d87bf92f381ccf58c43dde12925357b5d40b8b70908eb766871112f6c6578706572696d656e74616cf50037";

    private Tenant_sol_Tenant(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Tenant_sol_Tenant(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
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

    public RemoteCall<byte[]> getEducation() {
        Function function = new Function("getEducation", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
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

    public RemoteCall<TransactionReceipt> setPassword(byte[] _password) {
        Function function = new Function(
                "setPassword", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_password)), 
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

    public RemoteCall<String> getOrder(BigInteger id) {
        Function function = new Function("getOrder", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
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

    public RemoteCall<List<String>> getChatFilesHashAndName() {
        Function function = new Function("getChatFilesHashAndName", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Utf8String>>() {}));
        return executeRemoteCallSingleValueReturn(function, List<String>.class);
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

    public static RemoteCall<Tenant_sol_Tenant> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, byte[] _name, byte[] _password, List<byte[]> _otherInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.generated.Bytes32(_name), 
                new org.web3j.abi.datatypes.generated.Bytes32(_password), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherInfo, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Tenant_sol_Tenant.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Tenant_sol_Tenant> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, byte[] _name, byte[] _password, List<byte[]> _otherInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.generated.Bytes32(_name), 
                new org.web3j.abi.datatypes.generated.Bytes32(_password), 
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
