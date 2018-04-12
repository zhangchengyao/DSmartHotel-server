pragma solidity ^0.4.0;
contract Tender {

    uint public tenderId;
    uint public orderId;
    uint public tenantId;
    uint public price;
    bytes32 public roomAddress;
    uint public startTime;
    uint public leaveTime;
    bytes32 public roomType;
    bytes32 public hotelType;
    uint8 public roomNum;
    uint public createdAt;
    bytes32 public facilities;
    bytes32 public aroundSite;

    function Tender(uint _tenderId, uint8 _roomNum, bytes32[] _otherStrInfo, uint[] _otherIntInfo)
    public {
        tenderId = _tenderId;
        orderId = _otherIntInfo[0];
        tenantId = _otherIntInfo[1];
        price = _otherIntInfo[2];
        roomAddress = _otherStrInfo[0];
        startTime = _otherIntInfo[3];
        leaveTime = _otherIntInfo[4];
        roomType = _otherStrInfo[1];
        hotelType = _otherStrInfo[2];
        roomNum = _roomNum;
        createdAt = _otherIntInfo[5];
        facilities = _otherStrInfo[3];
        aroundSite = _otherStrInfo[4];
    }

}