pragma solidity ^0.4.0;
contract Bid {

    uint public bidId;
    uint public tenantId;
    uint public landlordId;
    uint8 public result;  //0:accept  1:refuse  2:negotiate
    uint public price;
    uint[] public roomIds;
    uint public orderId;
    uint public score;

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

}