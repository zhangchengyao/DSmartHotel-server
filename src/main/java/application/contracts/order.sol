pragma solidity ^0.4.0;
contract Order {

    uint public orderId;
    uint public tenantId;
    uint public landlordId;
    uint public price;
    uint public createDate;
    bytes32 public facilities;
    bytes32 public roomType;
    bytes32 public hotelType;
    bytes32 public aroundSite;
    uint public startTime;
    uint public leaveTime;
    uint public roomNum;
    // uint public point;
    bytes32 public roomAddress;

    function Order(uint _orderId, uint _tenantId, uint8 _roomNum, uint[] _otherIntInfo,
        bytes32[] _otherStrInfo) public {
        orderId = _orderId;
        tenantId = _tenantId;
        landlordId = _otherIntInfo[0];
        price = _otherIntInfo[1];
        createDate = _otherIntInfo[2];
        facilities = _otherStrInfo[0];
        roomType = _otherStrInfo[1];
        hotelType = _otherStrInfo[2];
        aroundSite = _otherStrInfo[3];
        startTime = _otherIntInfo[3];
        leaveTime = _otherIntInfo[4];
        roomNum = _roomNum;
        //   point = _point;
        roomAddress = _otherStrInfo[4];
    }

}