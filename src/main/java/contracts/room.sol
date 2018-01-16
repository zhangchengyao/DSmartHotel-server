pragma solidity ^0.4.0;
contract Room {
    uint public roomId;
    uint public landlordId;
    string public roomType;
    uint public price;
    uint public validStartTime;
    uint public validEndTime;
    uint public area;
    string public roomAddress;

    function Room(uint _roomId, uint _landlordId, string _roomType, uint _price,
        uint _validStartTime, uint _validEndTime, uint _area, string _roomAddress) public {
        roomId =_roomId;
        landlordId = _landlordId;
        roomType = _roomType;
        price = _price;
        validStartTime = _validStartTime;
        validEndTime = _validEndTime;
        area = _area;
        roomAddress = _roomAddress;
    }
}