pragma solidity ^0.4.0;
import "./landlord.sol";
import "./tenant.sol";
import "./bid.sol";
import "./tender.sol";
contract BidSystemFactory {
    mapping(uint => address) public landlordMapping;
    address[] public landlordList;

    mapping(uint => address) public tenantMapping;
    address[] public tenantList;

    mapping(uint => address) public bidMapping;
    address[] public bidList;

    mapping(uint => address) public tenderMapping;
    address[] public tenderList;


    /*
    Write creation functions below.
    */
    function createLandlord (uint _id, string _name, string _password, bytes32[] _otherInfo)
    public {
        address newLandlord = new Landlord(_id, _name, _password, _otherInfo);
        landlordList.push(newLandlord);
        landlordMapping[_id] = landlordList[landlordList.length - 1];
    }

    function createTenant (uint _id, string _name, string _password, bytes32[] _otherInfo) public {
        address newTenant = new Tenant(_id, _name, _password, _otherInfo);
        tenantList.push(newTenant);
        tenantMapping[_id] = tenantList[tenantList.length - 1];
    }

    function createTender (uint _tenderId, uint8 _roomNum, bytes32[] _otherStrInfo, uint[]
        _otherIntInfo) public {
        address newTender = new Tender(_tenderId, _roomNum, _otherStrInfo, _otherIntInfo);
        tenantList.push(newTender);
        tenderMapping[_tenderId] = tenantList[tenderList.length - 1];
    }

    function createBid (uint _bidId, uint _tenantId, uint _landlordId, uint8 _result, uint _price,
        uint[] _roomIds, uint _orderId, uint _score) public {
        address newBid = new Bid(_bidId, _tenantId, _landlordId, _result, _price, _roomIds,
            _orderId, _score);
        bidList.push(newBid);
        bidMapping[_bidId] = bidList[bidList.length - 1];
    }

    function getLandlord(uint id) public constant returns(address _landlord) {
        return landlordMapping[id];
    }
    function getNumOfLandlord() public constant returns (uint _number) {
        return landlordList.length;
    }
    function getTenant(uint id) public constant returns(address _tenant) {
        return tenantMapping[id];
    }
    function getNumOfTenant() public constant returns(uint _number) {
        return tenantList.length;
    }
    function getBid(uint id) public constant returns(address _bi) {
        return bidMapping[id];
    }
    function getNumOfBid() public constant returns (uint _number) {
        return bidList.length;
    }
    function getTender(uint id) public constant returns(address _tender) {
        return tenantMapping[id];
    }
    function getNumOfTenders() public constant returns (uint _number) {
        return tenderList.length;
    }
}