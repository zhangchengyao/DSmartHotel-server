pragma solidity ^0.4.0;
import "./user.sol";
import "./room.sol";
import "./order.sol";
import "./bid.sol";
import "./tender.sol";
contract Landlord is User{
    bytes32 public landlordtype;
    bytes32 public city;
    // string public area;
    bytes32 public detailAddress;
    bytes32 public comment;
    // uint public longitude;
    // uint public latitude;
    bytes32 public contact;
    bytes32 public introduction;
    bytes32 public characteristic;

    mapping(uint => address) public roomMapping;
    address[] public roomList;
    mapping(uint => address) public orderMapping;
    address[] public orderList;
    mapping(uint => address) public tenderMapping;
    address[] public tenderList;
    mapping(uint => address) public bidMapping;
    address[] public bidList;

    function Landlord(uint _id, string _name, string _password, bytes32[] _otherInfo)
    User ( _id,  _name,  _password) public {
        id = _id;
        name = _name;
        password = _password;
        landlordtype = _otherInfo[0];
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
}