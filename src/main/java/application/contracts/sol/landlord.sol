pragma solidity ^0.4.23;
import "./user.sol";
import "./room.sol";
import "./bid.sol";
import "./tender.sol";
contract Landlord is User{
    bytes32 landlordType;
    bytes32 city;
    // string area;
    bytes32 detailAddress;
    bytes32 comment;
    // uint public longitude;
    // uint public latitude;
    bytes32 contact;
    bytes32 introduction;
    bytes32 characteristic;

    mapping(uint => address) public roomMapping;
    address[] public roomList;
    mapping(uint => address) public tenderMapping;
    address[] public tenderList;
    mapping(uint => address) public bidMapping;
    address[] public bidList;

    function Landlord(uint _id, bytes32 _name, bytes32 _password, bytes32[] _otherInfo)
    User ( _id,  _name,  _password) public {
        id = _id;
        name = _name;
        password = _password;
        landlordType = _otherInfo[0];
        city = _otherInfo[1];
        // // area = _area;
        detailAddress = _otherInfo[2];
        comment = _otherInfo[3];
        // // longitude = _longitude;
        // // latitude = _latitude;
        contact = _otherInfo[4];
        introduction = _otherInfo[5];
        characteristic = _otherInfo[6];
    }

    function createRoom (uint _roomId, uint _landlordId, string _roomType, uint _price,
    uint _validStartTime, uint _validEndTime, uint _area, string _roomAddress) public {
        address newRoom = new Room(_roomId, _landlordId, _roomType, _price, _validStartTime,
        _validEndTime, _area, _roomAddress);
        roomList.push(newRoom);
        roomMapping[_roomId] = roomList[roomList.length - 1];
    }

    function createBid (uint _bidId, uint _tenantId, uint _landlordId, uint8 _result, uint _price,
    uint[] _roomIds, uint _orderId, uint _score) public {
        address newBid = new Bid(_bidId, _tenantId, _landlordId, _result, _price, _roomIds,
        _orderId, _score);
        bidList.push(newBid);
        bidMapping[_bidId] = bidList[bidList.length - 1];
    }

    function setLandlordType(bytes32 lordType) public {
        landlordType = lordType;
    }
    function getLandlordType() public constant returns(bytes32 _landlordType) {
        return landlordType;
    }

    function setCity(bytes32 _city) public {
        city = _city;
    }
    function getCity() public constant returns (bytes32 _city) {
        return city;
    }

    function setDetailAddress(bytes32 da) public {
        detailAddress = da;
    }
    function getDetailAddress() public constant returns(bytes32 _detailAddress) {
        return detailAddress;
    }

    function setComment(bytes32 _comment) public {
        comment = _comment;
    }
    function getComment() public constant returns (bytes32 _comment) {
        return comment;
    }

    function setContact(bytes32 _contact) public {
        contact = _contact;
    }
    function getContact() public constant returns(bytes32 _contact) {
        return contact;
    }

    function setIntroduction(bytes32 intro) public {
        introduction = intro;
    }
    function getIntroduction() public constant returns (bytes32 _introduction) {
        return introduction;
    }

    function setCharacteristic(bytes32 charac) public {
        characteristic = charac;
    }
    function getCharacteristic() public constant returns(bytes32 _characteristic) {
        return characteristic;
    }

    function getAllRooms() public constant returns(address[] _rooms) {
        return roomList;
    }
    function getRoom(uint id) public constant returns(address _room) {
        return roomMapping[id];
    }
    function getAllTenders() public constant returns(address[] _tenders) {
        return tenderList;
    }
    function getTender(uint id) public constant returns(address _tender) {
        return tenderMapping[id];
    }
    function getAllBids() public constant returns(address[] _bids) {
        return bidList;
    }
    function getBid(uint id) public constant returns(address _bid) {
        return bidMapping[id];
    }

}