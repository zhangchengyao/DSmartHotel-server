pragma solidity ^0.4.0;
contract Room {
    uint roomId;
    uint landlordId;
    string roomType;
    uint price;
    uint validStartTime;
    uint validEndTime;
    uint area;
    string roomAddress;

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

    function setRoomId(uint id) public {
        roomId = id;
    }
    function getRoomId() public constant returns (uint _roomId) {
        return roomId;
    }

    function setLandlordId(uint id) public {
        landlordId = id;
    }
    function getLandlordId() public constant returns (uint _landlordId) {
        return landlordId;
    }

    function setRoomType(string rType) public {
        roomType = rType;
    }
    function getRoomType() public constant returns (string _roomType) {
        return roomType;
    }

    function setPrice(uint p) public {
        price = p;
    }
    function getPrice() public constant returns (uint _price){
        return price;
    }

    function setValidStartTime(uint start) public {
        validStartTime = start;
    }
    function getValidStartTime() public constant returns (uint _validStartTime) {
        return validStartTime;
    }

    function setValidEndTime(uint end) public {
        validEndTime = end;
    }
    function getValidEndTime() public constant returns (uint _validEndTime) {
        return validEndTime;
    }

    function setArea(uint _area) public {
        area = _area;
    }
    function getArea() public constant returns (uint _area) {
        return area;
    }

    function setRoomAddress(string rAddress) public {
        roomAddress = rAddress;
    }
    function getRoomAddress() public constant returns (string _roomAddress) {
        return roomAddress;
    }
}