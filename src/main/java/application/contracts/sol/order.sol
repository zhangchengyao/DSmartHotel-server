pragma solidity ^0.4.22;
contract Order {
    uint orderId;

    uint tenantId;

    uint landlordId;

    uint price;

    uint createDate;

    bytes32 facilities;

    bytes32 roomType;

    bytes32 hotelType;

    bytes32 aroundSite;

    uint startTime;

    uint leaveTime;

    uint roomNum;
    // uint public point;
    bytes32 roomAddress;

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

    function setOrderId(uint id) public {
        orderId = id;
    }
    function getOrderId() public constant returns (uint _orderId){
        return orderId;
    }

    function setTenantId(uint id) public {
        tenantId = id;
    }
    function getTenantId() public constant returns (uint _tenantId) {
        return tenantId;
    }

    function setLandlordId(uint id) public {
        landlordId = id;
    }
    function getLandlordId() public constant returns (uint _landlordId) {
        return landlordId;
    }

    function setPrice(uint thePrice) public {
        price = thePrice;
    }
    function getPrice() public constant returns (uint _price) {
        return price;
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

    function setAroundSite(bytes32 around) public {
        aroundSite = around;
    }
    function getAroundSite() public constant returns (bytes32 _aroundSite) {
        return aroundSite;
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

    function setRoomNum(uint num) public {
        roomNum = num;
    }
    function getRoomNum() public constant returns (uint _roomNum) {
        return roomNum;
    }

    function setRoomAddress(bytes32 rAddress) public {
        roomAddress = rAddress;
    }
    function getRoomAddress() public constant returns (bytes32 _roomAddress) {
        return roomAddress;
    }
}