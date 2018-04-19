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
public final class Landlord_sol_Landlord extends Contract {
    private static final String BINARY = "60806040523480156200001157600080fd5b5060405162001c3938038062001c39833981016040908152815160208084015192840151606085015160008490559385018051939590949181019391019185918591859162000067916001919085019062000188565b5080516200007d90600290602084019062000188565b50505060008590555082516200009b90600190602086019062000188565b508151620000b190600290602085019062000188565b50806000815181101515620000c257fe5b60209081029091010151600355805181906001908110620000df57fe5b60209081029091010151600455805181906002908110620000fc57fe5b602090810290910101516005558051819060039081106200011957fe5b602090810290910101516006558051819060049081106200013657fe5b602090810290910101516007558051819060059081106200015357fe5b602090810290910101516008558051819060069081106200017057fe5b60209081029091010151600955506200022d92505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10620001cb57805160ff1916838001178555620001fb565b82800160010185558215620001fb579182015b82811115620001fb578251825591602001919060010190620001de565b50620002099291506200020d565b5090565b6200022a91905b8082111562000209576000815560010162000214565b90565b6119fc806200023d6000396000f30060806040526004361061018a5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630379915d811461018f57806308feff3d146101b657806317d7de7c146101d05780631db10fba1461025a578063228abcc61461026f5780632358c04614610284578063290bb453146102e9578063459fdac2146103425780635115aa54146103765780635b1f80ef1461038e5780635d1ca631146103a657806368049cf9146103bb578063761a0c55146103d35780637f85301a146103eb5780638d0f6da31461040057806399562037146104155780639eaa60541461042d578063a1983613146104e3578063a63a9aab146104fb578063c109d64314610513578063c47f00271461052b578063cc77304414610584578063cc8e239414610599578063cc950165146105ae578063d0e0ba95146105c3578063e00aee07146105db578063e79b763e146105f0578063f299e5ec14610608578063f350c01614610620578063f794cf2d14610638578063f8bbae521461064d575b600080fd5b34801561019b57600080fd5b506101a46106c2565b60408051918252519081900360200190f35b3480156101c257600080fd5b506101ce6004356106c9565b005b3480156101dc57600080fd5b506101e56106ce565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561021f578181015183820152602001610207565b50505050905090810190601f16801561024c5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561026657600080fd5b506101a4610763565b34801561027b57600080fd5b506101a4610769565b34801561029057600080fd5b5061029961076f565b60408051602080825283518183015283519192839290830191858101910280838360005b838110156102d55781810151838201526020016102bd565b505050509050019250505060405180910390f35b3480156102f557600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526101ce9436949293602493928401919081908401838280828437509497506107d09650505050505050565b34801561034e57600080fd5b5061035a6004356107e7565b60408051600160a060020a039092168252519081900360200190f35b34801561038257600080fd5b5061035a600435610802565b34801561039a57600080fd5b506101ce60043561082a565b3480156103b257600080fd5b506101a461082f565b3480156103c757600080fd5b5061035a600435610835565b3480156103df57600080fd5b506101ce600435610850565b3480156103f757600080fd5b506101a4610855565b34801561040c57600080fd5b5061029961085b565b34801561042157600080fd5b5061035a6004356108bb565b34801561043957600080fd5b50604080516020600460443581810135601f81018490048402850184019095528484526101ce94823594602480359536959460649492019190819084018382808284375050604080516020601f60808a01358b0180359182018390048302840183018552818452989b8a359b838c01359b958601359a60608701359a50919850965060a0909401945091928101919081908401838280828437509497506108c99650505050505050565b3480156104ef57600080fd5b5061035a600435610aad565b34801561050757600080fd5b5061035a600435610ac8565b34801561051f57600080fd5b506101ce600435610ad6565b34801561053757600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526101ce943694929360249392840191908190840183828082843750949750610adb9650505050505050565b34801561059057600080fd5b506101a4610aee565b3480156105a557600080fd5b506101e5610af4565b3480156105ba57600080fd5b506101a4610b52565b3480156105cf57600080fd5b506101ce600435610b58565b3480156105e757600080fd5b506101a4610b5d565b3480156105fc57600080fd5b506101ce600435610b63565b34801561061457600080fd5b506101ce600435610b68565b34801561062c57600080fd5b506101ce600435610b6d565b34801561064457600080fd5b50610299610b72565b34801561065957600080fd5b506040805160a435600481810135602081810285810182019096528185526101ce9583359560248035966044359660ff6064351696608435963696929560c49590940192829185019084908082843750949750508435955050506020909201359150610bd29050565b6004545b90565b600355565b60018054604080516020601f600260001961010087891615020190951694909404938401819004810282018101909252828152606093909290918301828280156107595780601f1061072e57610100808354040283529160200191610759565b820191906000526020600020905b81548152906001019060200180831161073c57829003601f168201915b5050505050905090565b60075490565b60035490565b6060600d80548060200260200160405190810160405280929190818152602001828054801561075957602002820191906000526020600020905b8154600160a060020a031681526001909101906020018083116107a9575050505050905090565b80516107e3906002906020840190610d39565b5050565b600a60205260009081526040902054600160a060020a031681565b600d80548290811061081057fe5b600091825260209091200154600160a060020a0316905081565b600455565b60005490565b600e60205260009081526040902054600160a060020a031681565b600555565b60095490565b6060600f80548060200260200160405190810160405280929190818152602001828054801561075957602002820191906000526020600020908154600160a060020a031681526001909101906020018083116107a9575050505050905090565b600f80548290811061081057fe5b600088888888888888886108db610db7565b808981526020018881526020018060200187815260200186815260200185815260200184815260200180602001838103835289818151815260200191508051906020019080838360005b8381101561093d578181015183820152602001610925565b50505050905090810190601f16801561096a5780820380516001836020036101000a031916815260200191505b50838103825284518152845160209182019186019080838360005b8381101561099d578181015183820152602001610985565b50505050905090810190601f1680156109ca5780820380516001836020036101000a031916815260200191505b509a5050505050505050505050604051809103906000f0801580156109f3573d6000803e3d6000fd5b50600b805460018101825560008290527f0175b7a638427703f0dbe7bb9bbf987a2551717b34e79f33b5b1008d1fa01db901805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0384161790558054919250906000198101908110610a5f57fe5b60009182526020808320909101549a8252600a905260409020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03909a16999099179098555050505050505050565b600c60205260009081526040902054600160a060020a031681565b600b80548290811061081057fe5b600855565b80516107e3906001906020840190610d39565b60065490565b60028054604080516020601f60001961010060018716150201909416859004938401819004810282018101909252828152606093909290918301828280156107595780601f1061072e57610100808354040283529160200191610759565b60085490565b600055565b60055490565b600955565b600755565b600655565b6060600b80548060200260200160405190810160405280929190818152602001828054801561075957602002820191906000526020600020908154600160a060020a031681526001909101906020018083116107a9575050505050905090565b60008888888888888888610be4610dc7565b808981526020018881526020018781526020018660ff1660ff16815260200185815260200180602001848152602001838152602001828103825285818151815260200191508051906020019060200280838360005b83811015610c51578181015183820152602001610c39565b505050509050019950505050505050505050604051809103906000f080158015610c7f573d6000803e3d6000fd5b50600f805460018101825560008290527f8d1108e10bcb7c27dddfc02ed9d693a074039d026cf4ea4240b40f7d581ac80201805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0384161790558054919250906000198101908110610ceb57fe5b60009182526020808320909101549a8252600e905260409020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03909a16999099179098555050505050505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10610d7a57805160ff1916838001178555610da7565b82800160010185558215610da7579182015b82811115610da7578251825591602001919060010190610d8c565b50610db3929150610dd7565b5090565b6040516106da80610df283390190565b604051610505806114cc83390190565b6106c691905b80821115610db35760008155600101610ddd5600608060405234801561001057600080fd5b506040516106da3803806106da8339810160409081528151602080840151928401516060850151608086015160a087015160c088015160e0890151600088905560018990559489018051979990979496939592949193920191610078916002918901906100ae565b50600385905560048490556005839055600682905580516100a09060079060208401906100ae565b505050505050505050610149565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106100ef57805160ff191683800117855561011c565b8280016001018555821561011c579182015b8281111561011c578251825591602001919060010190610101565b5061012892915061012c565b5090565b61014691905b808211156101285760008155600101610132565b90565b610582806101586000396000f3006080604052600436106100e55763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631395986381146100ea57806326357ada14610104578063375fb87a1461015d5780633f051d9b146101755780634acbca7a1461018d57806385be3e62146101a557806386fbd66c146101cc57806389eff133146101e157806391b7f5ed146101f657806398d5fdca1461020e5780639ed9495a14610223578063c1adfb0a146102ad578063c5482c14146102c2578063cf50e603146102d7578063dc4a611c146102ef578063ead4cf0014610348575b600080fd5b3480156100f657600080fd5b5061010260043561035d565b005b34801561011057600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526101029436949293602493928401919081908401838280828437509497506103629650505050505050565b34801561016957600080fd5b50610102600435610379565b34801561018157600080fd5b5061010260043561037e565b34801561019957600080fd5b50610102600435610383565b3480156101b157600080fd5b506101ba610388565b60408051918252519081900360200190f35b3480156101d857600080fd5b506101ba61038f565b3480156101ed57600080fd5b506101ba610395565b34801561020257600080fd5b5061010260043561039b565b34801561021a57600080fd5b506101ba6103a0565b34801561022f57600080fd5b506102386103a6565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561027257818101518382015260200161025a565b50505050905090810190601f16801561029f5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156102b957600080fd5b5061023861043c565b3480156102ce57600080fd5b506101ba61049a565b3480156102e357600080fd5b506101026004356104a0565b3480156102fb57600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526101029436949293602493928401919081908401838280828437509497506104a59650505050505050565b34801561035457600080fd5b506101ba6104b8565b600555565b80516103759060029060208401906104be565b5050565b600155565b600055565b600455565b6006545b90565b60005490565b60015490565b600355565b60035490565b60078054604080516020601f60026000196101006001881615020190951694909404938401819004810282018101909252828152606093909290918301828280156104325780601f1061040757610100808354040283529160200191610432565b820191906000526020600020905b81548152906001019060200180831161041557829003601f168201915b5050505050905090565b60028054604080516020601f60001961010060018716150201909416859004938401819004810282018101909252828152606093909290918301828280156104325780601f1061040757610100808354040283529160200191610432565b60055490565b600655565b80516103759060079060208401906104be565b60045490565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106104ff57805160ff191683800117855561052c565b8280016001018555821561052c579182015b8281111561052c578251825591602001919060010190610511565b5061053892915061053c565b5090565b61038c91905b8082111561053857600081556001016105425600a165627a7a7230582097b3d54df2151671fc805a107c544ed9a1061912b88b2ebb18c2b83ffe694d340029608060405234801561001057600080fd5b506040516105053803806105058339810160409081528151602080840151928401516060850151608086015160a087015160c088015160e08901516000889055600189905560028690556003805460ff191660ff8716179055600484905591909801805196989496939592949093909261008f916005918601906100a5565b506006919091556007555061010d945050505050565b8280548282559060005260206000209081019282156100e0579160200282015b828111156100e05782518255916020019190600101906100c5565b506100ec9291506100f0565b5090565b61010a91905b808211156100ec57600081556001016100f6565b90565b6103e98061011c6000396000f3006080604052600436106100e55763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166331b3202c81146100ea578063375fb87a14610104578063422beeba1461011c5780635acb5edc1461013457806380ce60d11461019957806389eff133146101b457806391b7f5ed146101db578063977f38f4146101f357806398d5fdca1461020b5780639a7ef1c3146102205780639fa8903014610235578063a84964261461024a578063afd820671461025f578063d1d875a114610274578063de2927891461028c578063e874eaaa146102b7575b600080fd5b3480156100f657600080fd5b506101026004356102cf565b005b34801561011057600080fd5b506101026004356102d4565b34801561012857600080fd5b506101026004356102d9565b34801561014057600080fd5b506101496102de565b60408051602080825283518183015283519192839290830191858101910280838360005b8381101561018557818101518382015260200161016d565b505050509050019250505060405180910390f35b3480156101a557600080fd5b5061010260ff60043516610336565b3480156101c057600080fd5b506101c961034c565b60408051918252519081900360200190f35b3480156101e757600080fd5b50610102600435610352565b3480156101ff57600080fd5b50610102600435610357565b34801561021757600080fd5b506101c961038c565b34801561022c57600080fd5b506101c9610392565b34801561024157600080fd5b506101c9610398565b34801561025657600080fd5b506101c961039e565b34801561026b57600080fd5b506101c96103a4565b34801561028057600080fd5b506101026004356103aa565b34801561029857600080fd5b506102a16103af565b6040805160ff9092168252519081900360200190f35b3480156102c357600080fd5b506101026004356103b8565b600655565b600255565b600755565b6060600580548060200260200160405190810160405280929190818152602001828054801561032c57602002820191906000526020600020905b815481526020019060010190808311610318575b5050505050905090565b6003805460ff191660ff92909216919091179055565b60025490565b600455565b600580546001810182556000919091527f036b6384b5eca791c62761152d0c79bb0604c104a5fb6f4eb0703f3154bb3db00155565b60045490565b60005490565b60015490565b60065490565b60075490565b600055565b60035460ff1690565b6001555600a165627a7a72305820f6086af72083f102f8581731efdf4c268d0790e2277dc02e453eacd8572d0b870029a165627a7a723058202bdbca3e2cef720c22e0e20b0581dce9510f3874d66c2197701f4a9b26b3288c0029";

    private Landlord_sol_Landlord(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Landlord_sol_Landlord(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<byte[]> getCity() {
        Function function = new Function("getCity", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setLandlordType(byte[] lordType) {
        Function function = new Function(
                "setLandlordType", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(lordType)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getName() {
        Function function = new Function("getName", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> getContact() {
        Function function = new Function("getContact", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getLandlordType() {
        Function function = new Function("getLandlordType", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<List<String>> getAllTenders() {
        Function function = new Function("getAllTenders", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return executeRemoteCallSingleValueReturn(function, List<String>.class);
    }

    public RemoteCall<TransactionReceipt> setPassword(String pw) {
        Function function = new Function(
                "setPassword", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(pw)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> roomMapping(BigInteger param0) {
        Function function = new Function("roomMapping", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> tenderList(BigInteger param0) {
        Function function = new Function("tenderList", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setCity(byte[] _city) {
        Function function = new Function(
                "setCity", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_city)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> getId() {
        Function function = new Function("getId", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> bidMapping(BigInteger param0) {
        Function function = new Function("bidMapping", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setDetailAddress(byte[] da) {
        Function function = new Function(
                "setDetailAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(da)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getCharacteristic() {
        Function function = new Function("getCharacteristic", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<List<String>> getAllBids() {
        Function function = new Function("getAllBids", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return executeRemoteCallSingleValueReturn(function, List<String>.class);
    }

    public RemoteCall<String> bidList(BigInteger param0) {
        Function function = new Function("bidList", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> createRoom(BigInteger _roomId, BigInteger _landlordId, String _roomType, BigInteger _price, BigInteger _validStartTime, BigInteger _validEndTime, BigInteger _area, String _roomAddress) {
        Function function = new Function(
                "createRoom", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_roomId), 
                new org.web3j.abi.datatypes.generated.Uint256(_landlordId), 
                new org.web3j.abi.datatypes.Utf8String(_roomType), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.generated.Uint256(_validStartTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_validEndTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_area), 
                new org.web3j.abi.datatypes.Utf8String(_roomAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> tenderMapping(BigInteger param0) {
        Function function = new Function("tenderMapping", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> roomList(BigInteger param0) {
        Function function = new Function("roomList", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setIntroduction(byte[] intro) {
        Function function = new Function(
                "setIntroduction", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(intro)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setName(String _name) {
        Function function = new Function(
                "setName", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getComment() {
        Function function = new Function("getComment", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<String> getPassword() {
        Function function = new Function("getPassword", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<byte[]> getIntroduction() {
        Function function = new Function("getIntroduction", 
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

    public RemoteCall<byte[]> getDetailAddress() {
        Function function = new Function("getDetailAddress", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> setCharacteristic(byte[] charac) {
        Function function = new Function(
                "setCharacteristic", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(charac)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setContact(byte[] _contact) {
        Function function = new Function(
                "setContact", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_contact)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setComment(byte[] _comment) {
        Function function = new Function(
                "setComment", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_comment)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<List<String>> getAllRooms() {
        Function function = new Function("getAllRooms", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return executeRemoteCallSingleValueReturn(function, List<String>.class);
    }

    public RemoteCall<TransactionReceipt> createBid(BigInteger _bidId, BigInteger _tenantId, BigInteger _landlordId, BigInteger _result, BigInteger _price, List<BigInteger> _roomIds, BigInteger _orderId, BigInteger _score) {
        Function function = new Function(
                "createBid", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_bidId), 
                new org.web3j.abi.datatypes.generated.Uint256(_tenantId), 
                new org.web3j.abi.datatypes.generated.Uint256(_landlordId), 
                new org.web3j.abi.datatypes.generated.Uint8(_result), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_roomIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.Uint256(_orderId), 
                new org.web3j.abi.datatypes.generated.Uint256(_score)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Landlord_sol_Landlord> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, String _name, String _password, List<byte[]> _otherInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_password), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherInfo, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Landlord_sol_Landlord.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Landlord_sol_Landlord> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, String _name, String _password, List<byte[]> _otherInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.Utf8String(_password), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherInfo, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Landlord_sol_Landlord.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Landlord_sol_Landlord load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Landlord_sol_Landlord(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Landlord_sol_Landlord load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Landlord_sol_Landlord(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
