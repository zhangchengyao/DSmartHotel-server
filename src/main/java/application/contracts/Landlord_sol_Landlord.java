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
    private static final String BINARY = "60806040523480156200001157600080fd5b50604051620020b6380380620020b68339810180604052620000379190810190620001b8565b600084815560018490556002839055815182919081106200005457fe5b602090810290910101516004558051819060019081106200007157fe5b602090810290910101516005558051819060029081106200008e57fe5b60209081029091010151600655805181906003908110620000ab57fe5b60209081029091010151600755805181906004908110620000c857fe5b60209081029091010151600855805181906005908110620000e557fe5b602090810290910101516009558051819060069081106200010257fe5b60209081029091010151600a55506200028592505050565b6000601f820183136200012c57600080fd5b8151620001436200013d8262000261565b6200023a565b915081818352602084019350602081019050838560208402820111156200016957600080fd5b60005b83811015620001995781620001828882620001a3565b84525060209283019291909101906001016200016c565b5050505092915050565b6000620001b1825162000282565b9392505050565b60008060008060808587031215620001cf57600080fd5b6000620001dd8787620001a3565b9450506020620001f087828801620001a3565b93505060406200020387828801620001a3565b92505060608501516001604060020a038111156200022057600080fd5b6200022e878288016200011a565b91505092959194509250565b6040518181016001604060020a03811182821017156200025957600080fd5b604052919050565b60006001604060020a038211156200027857600080fd5b5060209081020190565b90565b611e2180620002956000396000f300608060405260043610620001f25763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630379915d8114620001f45780630585c25e146200022457806308feff3d14620002585780630981ca98146200027d57806317d7de7c14620002a25780631db10fba14620002ba5780631fef2c3314620002d2578063228abcc614620002f75780632358c046146200030f5780633c889e6f1462000336578063459fdac2146200035b5780635115aa5414620003805780635ac801fe14620003a55780635b1f80ef14620003ca5780635d1ca63114620003ef57806368049cf914620004075780636d8a74cb146200042c578063761a0c5514620004515780637f85301a14620004765780638d0f6da3146200048e5780639956203714620004a65780639f39154414620004cb578063a198361314620004f0578063a63a9aab1462000515578063c109d643146200053a578063c4076876146200055f578063cc7730441462000593578063cc8e239414620005ab578063cc95016514620005c3578063d0e0ba9514620005db578063e00aee071462000600578063e79b763e1462000618578063f299e5ec146200063d578063f350c0161462000662578063f64a8b801462000687578063f794cf2d14620006ae578063f8bbae5214620006c6575b005b3480156200020157600080fd5b506200020c620006eb565b6040516200021b919062001393565b60405180910390f35b3480156200023157600080fd5b50620002496200024336600462001031565b620006f2565b6040516200021b91906200134d565b3480156200026557600080fd5b50620001f26200027736600462001031565b6200070d565b3480156200028a57600080fd5b50620001f26200029c36600462000ff0565b62000712565b348015620002af57600080fd5b506200020c6200072b565b348015620002c757600080fd5b506200020c62000731565b348015620002df57600080fd5b50620001f2620002f136600462001052565b62000737565b3480156200030457600080fd5b506200020c62000836565b3480156200031c57600080fd5b50620003276200083c565b6040516200021b91906200135d565b3480156200034357600080fd5b50620002496200035536600462001031565b620008a0565b3480156200036857600080fd5b50620002496200037a36600462001031565b620008bb565b3480156200038d57600080fd5b50620002496200039f36600462001031565b620008d6565b348015620003b257600080fd5b50620001f2620003c436600462001031565b620008ff565b348015620003d757600080fd5b50620001f2620003e936600462001031565b62000904565b348015620003fc57600080fd5b506200020c62000909565b3480156200041457600080fd5b50620002496200042636600462001031565b6200090f565b3480156200043957600080fd5b50620002496200044b36600462001031565b6200092a565b3480156200045e57600080fd5b50620001f26200047036600462001031565b62000945565b3480156200048357600080fd5b506200020c6200094a565b3480156200049b57600080fd5b506200032762000950565b348015620004b357600080fd5b5062000249620004c536600462001031565b620009b2565b348015620004d857600080fd5b50620001f2620004ea36600462001031565b620009c1565b348015620004fd57600080fd5b50620002496200050f36600462001031565b620009c6565b3480156200052257600080fd5b50620002496200053436600462001031565b620009e1565b3480156200054757600080fd5b50620001f26200055936600462001031565b620009f0565b3480156200056c57600080fd5b50620005846200057e36600462000fb1565b620009f5565b6040516200021b919062001383565b348015620005a057600080fd5b506200020c62000a3a565b348015620005b857600080fd5b506200020c62000a40565b348015620005d057600080fd5b506200020c62000a46565b348015620005e857600080fd5b50620001f2620005fa36600462001031565b62000a4c565b3480156200060d57600080fd5b506200020c62000a51565b3480156200062557600080fd5b50620001f26200063736600462001031565b62000a57565b3480156200064a57600080fd5b50620001f26200065c36600462001031565b62000a5c565b3480156200066f57600080fd5b50620001f26200068136600462001031565b62000a61565b3480156200069457600080fd5b506200069f62000a66565b6040516200021b919062001370565b348015620006bb57600080fd5b506200032762000b44565b348015620006d357600080fd5b50620001f2620006e536600462001113565b62000ba6565b6005545b90565b6000908152600d6020526040902054600160a060020a031690565b600455565b80516200072790600390602084019062000ca5565b5050565b60015490565b60085490565b600088888888888888886200074b62000d09565b6200075e989796959493929190620013a3565b604051809103906000f0801580156200077b573d6000803e3d6000fd5b50600c805460018101825560008290527fdf6966c971051c3d54ec59162606531493a51404a002842f56009d7e5cf4a8c701805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0384161790558054919250906000198101908110620007e857fe5b60009182526020808320909101549a8252600b905260409020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03909a16999099179098555050505050505050565b60045490565b6060600e8054806020026020016040519081016040528092919081815260200182805480156200089657602002820191906000526020600020905b8154600160a060020a0316815260019091019060200180831162000877575b5050505050905090565b6000908152600f6020526040902054600160a060020a031690565b600b60205260009081526040902054600160a060020a031681565b600e805482908110620008e557fe5b600091825260209091200154600160a060020a0316905081565b600155565b600555565b60005490565b600f60205260009081526040902054600160a060020a031681565b6000908152600b6020526040902054600160a060020a031690565b600655565b600a5490565b606060108054806020026020016040519081016040528092919081815260200182805480156200089657602002820191906000526020600020908154600160a060020a0316815260019091019060200180831162000877575050505050905090565b6010805482908110620008e557fe5b600255565b600d60205260009081526040902054600160a060020a031681565b600c805482908110620008e557fe5b600955565b604051600090600160a060020a0384169083156108fc0290849084818181858888f1935050505015801562000a2e573d6000803e3d6000fd5b50600190505b92915050565b60075490565b60025490565b60095490565b600055565b60065490565b600a55565b600855565b600755565b60606003805480602002602001604051908101604052809291908181526020016000905b8282101562000b3b5760008481526020908190208301805460408051601f600260001961010060018716150201909416939093049283018590048502810185019091528181529283018282801562000b265780601f1062000afa5761010080835404028352916020019162000b26565b820191906000526020600020905b81548152906001019060200180831162000b0857829003601f168201915b50505050508152602001906001019062000a8a565b50505050905090565b6060600c8054806020026020016040519081016040528092919081815260200182805480156200089657602002820191906000526020600020908154600160a060020a0316815260019091019060200180831162000877575050505050905090565b6000888888888888888862000bba62000d1a565b62000bcd9897969594939291906200142a565b604051809103906000f08015801562000bea573d6000803e3d6000fd5b506010805460018101825560008290527f1b6847dc741a1b0cd08d278845f9d819d87b734759afb55fe2de5cb82a9ae67201805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a038416179055805491925090600019810190811062000c5757fe5b60009182526020808320909101549a8252600f905260409020805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a03909a16999099179098555050505050505050565b82805482825590600052602060002090810192821562000cf7579160200282015b8281111562000cf7578251805162000ce691849160209091019062000d2b565b509160200191906001019062000cc6565b5062000d0592915062000dac565b5090565b604051610369806200157a83390190565b60405161050580620018e383390190565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1062000d6e57805160ff191683800117855562000d9e565b8280016001018555821562000d9e579182015b8281111562000d9e57825182559160200191906001019062000d81565b5062000d0592915062000dd4565b620006ef91905b8082111562000d0557600062000dca828262000df1565b5060010162000db3565b620006ef91905b8082111562000d05576000815560010162000ddb565b50805460018160011615610100020316600290046000825580601f1062000e19575062000e39565b601f01602090049060005260206000209081019062000e39919062000dd4565b50565b600062000e4a823562001519565b9392505050565b6000601f8201831362000e6357600080fd5b813562000e7a62000e7482620014c4565b6200149c565b81815260209384019390925082018360005b8381101562000ebc578135860162000ea5888262000f4d565b845250602092830192919091019060010162000e8c565b5050505092915050565b6000601f8201831362000ed857600080fd5b813562000ee962000e7482620014c4565b9150818183526020840193506020810190508385602084028201111562000f0f57600080fd5b60005b8381101562000ebc578162000f28888262000f3f565b845250602092830192919091019060010162000f12565b600062000e4a8235620006ef565b6000601f8201831362000f5f57600080fd5b813562000f7062000e7482620014e6565b9150808252602083016020830185838301111562000f8d57600080fd5b62000f9a83828462001530565b50505092915050565b600062000e4a82356200152a565b6000806040838503121562000fc557600080fd5b600062000fd3858562000e3c565b925050602062000fe68582860162000f3f565b9150509250929050565b6000602082840312156200100357600080fd5b813567ffffffffffffffff8111156200101b57600080fd5b620010298482850162000e51565b949350505050565b6000602082840312156200104457600080fd5b600062001029848462000f3f565b600080600080600080600080610100898b0312156200107057600080fd5b60006200107e8b8b62000f3f565b9850506020620010918b828c0162000f3f565b9750506040620010a48b828c0162000f3f565b9650506060620010b78b828c0162000f3f565b9550506080620010ca8b828c0162000f3f565b94505060a0620010dd8b828c0162000f3f565b93505060c0620010f08b828c0162000f3f565b92505060e0620011038b828c0162000f3f565b9150509295985092959890939650565b600080600080600080600080610100898b0312156200113157600080fd5b60006200113f8b8b62000f3f565b9850506020620011528b828c0162000f3f565b9750506040620011658b828c0162000f3f565b9650506060620011788b828c0162000fa3565b95505060806200118b8b828c0162000f3f565b94505060a089013567ffffffffffffffff811115620011a957600080fd5b620010dd8b828c0162000ec6565b620011c28162001519565b82525050565b6000620011d58262001515565b808452602084019350620011e9836200150f565b60005b828110156200121f5762001202868351620011b7565b6200120d826200150f565b602096909601959150600101620011ec565b5093949350505050565b6000620012368262001515565b8084526020840193508360208202850162001251856200150f565b60005b848110156200128e5783830388526200126f83835162001307565b92506200127c826200150f565b60209890980197915060010162001254565b50909695505050505050565b6000620012a78262001515565b808452602084019350620012bb836200150f565b60005b828110156200121f57620012d4868351620012fc565b620012df826200150f565b602096909601959150600101620012be565b620011c28162001525565b620011c281620006ef565b6000620013148262001515565b8084526200132a8160208601602086016200153c565b62001335816200156f565b9093016020019392505050565b620011c2816200152a565b6020810162000a348284620011b7565b6020808252810162000e4a8184620011c8565b6020808252810162000e4a818462001229565b6020810162000a348284620012f1565b6020810162000a348284620012fc565b6101008101620013b4828b620012fc565b620013c3602083018a620012fc565b620013d26040830189620012fc565b620013e16060830188620012fc565b620013f06080830187620012fc565b620013ff60a0830186620012fc565b6200140e60c0830185620012fc565b6200141d60e0830184620012fc565b9998505050505050505050565b61010081016200143b828b620012fc565b6200144a602083018a620012fc565b620014596040830189620012fc565b62001468606083018862001342565b620014776080830187620012fc565b81810360a08301526200148b81866200129a565b90506200140e60c0830185620012fc565b60405181810167ffffffffffffffff81118282101715620014bc57600080fd5b604052919050565b600067ffffffffffffffff821115620014dc57600080fd5b5060209081020190565b600067ffffffffffffffff821115620014fe57600080fd5b506020601f91909101601f19160190565b60200190565b5190565b600160a060020a031690565b151590565b60ff1690565b82818337506000910152565b60005b83811015620015595781810151838201526020016200153f565b8381111562001569576000848401525b50505050565b601f01601f1916905600608060405234801561001057600080fd5b506040516101008061036983398101604090815281516020830151918301516060840151608085015160a086015160c087015160e0909701516000959095556001959095556002929092556003556004556005919091556006919091556007556102ea8061007f6000396000f3006080604052600436106100e55763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416631395986381146100ea578063375fb87a146101045780633f051d9b1461011c5780634acbca7a14610134578063808114201461014c57806385be3e621461016457806386fbd66c1461018b57806389eff133146101a057806391b7f5ed146101b557806398d5fdca146101cd5780639ed9495a146101e2578063c1adfb0a146101f7578063c5482c141461020c578063ca87b54c14610221578063cf50e60314610239578063ead4cf0014610251575b600080fd5b3480156100f657600080fd5b50610102600435610266565b005b34801561011057600080fd5b5061010260043561026b565b34801561012857600080fd5b50610102600435610270565b34801561014057600080fd5b50610102600435610275565b34801561015857600080fd5b5061010260043561027a565b34801561017057600080fd5b5061017961027f565b60408051918252519081900360200190f35b34801561019757600080fd5b50610179610285565b3480156101ac57600080fd5b5061017961028b565b3480156101c157600080fd5b50610102600435610291565b3480156101d957600080fd5b50610179610296565b3480156101ee57600080fd5b5061017961029c565b34801561020357600080fd5b506101796102a2565b34801561021857600080fd5b506101796102a8565b34801561022d57600080fd5b506101026004356102ae565b34801561024557600080fd5b506101026004356102b3565b34801561025d57600080fd5b506101796102b8565b600555565b600155565b600055565b600455565b600255565b60065490565b60005490565b60015490565b600355565b60035490565b60075490565b60025490565b60055490565b600755565b600655565b600454905600a165627a7a72305820c909f1720d7dc3932c9e8fcc4d28cf9e4291543f1040c9d808b3894be964bc230029608060405234801561001057600080fd5b506040516105053803806105058339810160409081528151602080840151928401516060850151608086015160a087015160c088015160e08901516000889055600189905560028690556003805460ff191660ff8716179055600484905591909801805196989496939592949093909261008f916005918601906100a5565b506006919091556007555061010d945050505050565b8280548282559060005260206000209081019282156100e0579160200282015b828111156100e05782518255916020019190600101906100c5565b506100ec9291506100f0565b5090565b61010a91905b808211156100ec57600081556001016100f6565b90565b6103e98061011c6000396000f3006080604052600436106100e55763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166331b3202c81146100ea578063375fb87a14610104578063422beeba1461011c5780635acb5edc1461013457806380ce60d11461019957806389eff133146101b457806391b7f5ed146101db578063977f38f4146101f357806398d5fdca1461020b5780639a7ef1c3146102205780639fa8903014610235578063a84964261461024a578063afd820671461025f578063d1d875a114610274578063de2927891461028c578063e874eaaa146102b7575b600080fd5b3480156100f657600080fd5b506101026004356102cf565b005b34801561011057600080fd5b506101026004356102d4565b34801561012857600080fd5b506101026004356102d9565b34801561014057600080fd5b506101496102de565b60408051602080825283518183015283519192839290830191858101910280838360005b8381101561018557818101518382015260200161016d565b505050509050019250505060405180910390f35b3480156101a557600080fd5b5061010260ff60043516610336565b3480156101c057600080fd5b506101c961034c565b60408051918252519081900360200190f35b3480156101e757600080fd5b50610102600435610352565b3480156101ff57600080fd5b50610102600435610357565b34801561021757600080fd5b506101c961038c565b34801561022c57600080fd5b506101c9610392565b34801561024157600080fd5b506101c9610398565b34801561025657600080fd5b506101c961039e565b34801561026b57600080fd5b506101c96103a4565b34801561028057600080fd5b506101026004356103aa565b34801561029857600080fd5b506102a16103af565b6040805160ff9092168252519081900360200190f35b3480156102c357600080fd5b506101026004356103b8565b600655565b600255565b600755565b6060600580548060200260200160405190810160405280929190818152602001828054801561032c57602002820191906000526020600020905b815481526020019060010190808311610318575b5050505050905090565b6003805460ff191660ff92909216919091179055565b60025490565b600455565b600580546001810182556000919091527f036b6384b5eca791c62761152d0c79bb0604c104a5fb6f4eb0703f3154bb3db00155565b60045490565b60005490565b60015490565b60065490565b60075490565b600055565b60035460ff1690565b6001555600a165627a7a72305820d1effc16ccd13039bb35e6f257ee4344480fa53c114e1f687d5cb8da65e2806a0029a265627a7a72305820c3a6a1ddc898dd2c036bf843b13fe7c0db3b382d52989a532f958911569515346c6578706572696d656e74616cf50037";

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

    public RemoteCall<String> getTender(BigInteger id) {
        Function function = new Function("getTender", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setLandlordType(byte[] lordType) {
        Function function = new Function(
                "setLandlordType", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(lordType)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
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

    public RemoteCall<byte[]> getContact() {
        Function function = new Function("getContact", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> createRoom(BigInteger _roomId, BigInteger _landlordId, byte[] _roomType, BigInteger _price, BigInteger _validStartTime, BigInteger _validEndTime, BigInteger _area, byte[] _roomAddress) {
        Function function = new Function(
                "createRoom", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_roomId), 
                new org.web3j.abi.datatypes.generated.Uint256(_landlordId), 
                new org.web3j.abi.datatypes.generated.Bytes32(_roomType), 
                new org.web3j.abi.datatypes.generated.Uint256(_price), 
                new org.web3j.abi.datatypes.generated.Uint256(_validStartTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_validEndTime), 
                new org.web3j.abi.datatypes.generated.Uint256(_area), 
                new org.web3j.abi.datatypes.generated.Bytes32(_roomAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getLandlordType() {
        Function function = new Function("getLandlordType", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<List> getAllTenders() {
        Function function = new Function("getAllTenders", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return executeRemoteCallSingleValueReturn(function, List.class);
    }

    public RemoteCall<String> getBid(BigInteger id) {
        Function function = new Function("getBid", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
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

    public RemoteCall<TransactionReceipt> setName(byte[] _name) {
        Function function = new Function(
                "setName", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_name)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
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

    public RemoteCall<String> getRoom(BigInteger id) {
        Function function = new Function("getRoom", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(id)), 
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

    public RemoteCall<List> getAllBids() {
        Function function = new Function("getAllBids", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return executeRemoteCallSingleValueReturn(function, List.class);
    }

    public RemoteCall<String> bidList(BigInteger param0) {
        Function function = new Function("bidList", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setPassword(byte[] _password) {
        Function function = new Function(
                "setPassword", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_password)), 
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

    public RemoteCall<TransactionReceipt> pay(String _exchange, BigInteger _amout) {
        Function function = new Function(
                "pay", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_exchange), 
                new org.web3j.abi.datatypes.generated.Uint256(_amout)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<byte[]> getComment() {
        Function function = new Function("getComment", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<byte[]> getPassword() {
        Function function = new Function("getPassword", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
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

    public RemoteCall<List> getChatFilesHashAndName() {
        Function function = new Function("getChatFilesHashAndName", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Utf8String>>() {}));
        return executeRemoteCallSingleValueReturn(function, List.class);
    }

    public RemoteCall<List> getAllRooms() {
        Function function = new Function("getAllRooms", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Address>>() {}));
        return executeRemoteCallSingleValueReturn(function, List.class);
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

    public static RemoteCall<Landlord_sol_Landlord> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, byte[] _name, byte[] _password, List<byte[]> _otherInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.generated.Bytes32(_name), 
                new org.web3j.abi.datatypes.generated.Bytes32(_password), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(_otherInfo, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Landlord_sol_Landlord.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Landlord_sol_Landlord> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger _id, byte[] _name, byte[] _password, List<byte[]> _otherInfo) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id), 
                new org.web3j.abi.datatypes.generated.Bytes32(_name), 
                new org.web3j.abi.datatypes.generated.Bytes32(_password), 
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
