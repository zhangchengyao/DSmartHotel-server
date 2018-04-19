pragma solidity ^0.4.0;
contract Bid {
    uint bidId;

    uint tenantId;

    uint landlordId;

    uint8 result;  //0:accept  1:refuse  2:negotiate

    uint price;

    uint[] roomIds;

    uint orderId;

    uint score;

    function Bid(uint _bidId, uint _tenantId, uint _landlordId, uint8 _result, uint _price,
        uint[] _roomIds, uint _orderId, uint _score) public {
        bidId = _bidId;
        tenantId = _tenantId;
        landlordId = _landlordId;
        result = _result;
        price = _price;
        roomIds = _roomIds;
        orderId = _orderId;
        score = _score;
    }

    function setBidId(uint id) public {
        bidId = id;
    }
    function getBidId() public constant returns (uint _bidId){
        return bidId;
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

    function setResult(uint8 theResult) public {
        result = theResult;
    }
    function getResult() public constant returns (uint8 _result) {
        return result;
    }

    function setPrice(uint thePrice) public {
        price = thePrice;
    }
    function getPrice() public constant returns (uint _price) {
        return price;
    }

    function setRoomIds(uint id) public {
        roomIds.push(id);
    }
    function getRoomIds() public constant returns (uint[] _roomIds) {
        return roomIds;
    }

    function setOrderId(uint id) public {
        orderId = id;
    }
    function getOrderId() public constant returns (uint _orderId) {
        return orderId;
    }

    function setScore(uint sc) public {
        score = sc;
    }
    function getScore() public constant returns (uint score) {
        return score;
    }
}