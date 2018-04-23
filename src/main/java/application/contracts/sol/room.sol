pragma solidity ^0.4.22;
contract Room {
    uint roomId;
    uint landlordId;
    bytes32 roomType;
    uint price;
    uint validStartTime;
    uint validEndTime;
    uint area;
    bytes32 roomAddress;

    function Room(uint _roomId, uint _landlordId, bytes32 _roomType, uint _price,
    uint _validStartTime, uint _validEndTime, uint _area, bytes32 _roomAddress) public {
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

    function setRoomType(bytes32 rType) public {
        roomType = rType;
    }
    function getRoomType() public constant returns (bytes32 _roomType) {
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

    function setRoomAddress(bytes32 rAddress) public {
        roomAddress = rAddress;
    }
    function getRoomAddress() public constant returns (bytes32 _roomAddress) {
        return roomAddress;
    }
}