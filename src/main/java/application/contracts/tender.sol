pragma solidity ^0.4.0;
contract Tender {

    uint tenderId;
    uint orderId;
    uint tenantId;
    uint price;
    bytes32 roomAddress;
    uint startTime;
    uint leaveTime;
    bytes32 roomType;
    bytes32 hotelType;
    uint roomNum;
    uint createDate;
    bytes32 facilities;
    bytes32 aroundSite;

    function Tender(uint _tenderId, uint _roomNum, bytes32[] _otherStrInfo, uint[] _otherIntInfo)
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
        createDate = _otherIntInfo[5];
        facilities = _otherStrInfo[3];
        aroundSite = _otherStrInfo[4];
    }

    function setTenderId(uint id) public {
        tenderId = id;
    }
    function getTenderId() public constant returns (uint _tenderId){
        return tenderId;
    }

    function setTenantId(uint id) public {
        tenantId = id;
    }
    function getTenantId() public constant returns (uint _tenantId) {
        return tenantId;
    }

    function setPrice(uint thePrice) public {
        price = thePrice;
    }
    function getPrice() public constant returns (uint _price) {
        return price;
    }

    function setRoomAddress(bytes32 rAddress) public {
        roomAddress = rAddress;
    }
    function getRoomAddress() public constant returns (bytes32 _roomAddress) {
        return roomAddress;
    }

    function setStartTime(uint start) public {
        startTime = start;
    }
    function getStartTime() public constant returns (uint _startTime) {
        return startTime;
    }

    function setLeaveTime(uint leave) public {
        leaveTime = leave;
    }
    function getLeaveTime() public constant returns (uint _leaveTime) {
        return leaveTime;
    }

    function setRoomType(bytes32 rType) public {
        roomType = rType;
    }
    function getRoomType() public constant returns (bytes32 _roomType) {
        return roomType;
    }

    function setHotelType(bytes32 hType) public {
        hotelType = hType;
    }
    function getHotelType() public constant returns (bytes32 _hotelType) {
        return hotelType;
    }

    function setRoomNum(uint num) public {
        roomNum = num;
    }
    function getRoomNum() public constant returns (uint _roomNum) {
        return roomNum;
    }

    function setCreateDate(uint date) public {
        createDate = date;
    }
    function getCreateDate() public constant returns (uint _createDate) {
        return createDate;
    }

    function setFacility(bytes32 _facilities) public {
        facilities = _facilities;
    }
    function getFacility() public constant returns (bytes32 _facilities) {
        return facilities;
    }

    function setAroundSite(bytes32 around) public {
        aroundSite = around;
    }
    function getAroundSite() public constant returns (bytes32 _aroundSite) {
        return aroundSite;
    }
}