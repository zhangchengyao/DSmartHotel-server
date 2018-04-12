pragma solidity ^0.4.0;
import "./user.sol";
import "./order.sol";
contract Tenant is User{
    bytes32 public gender;
    bytes32 public phoneNum;
    bytes32 public preference;
    bytes32 public education;
    bytes32 public vocation;
    bytes32 public economic;

    mapping(uint => address) public orderMapping;
    address[] public orderList;

    function Tenant(uint _id, string _name, string _password, bytes32[] _otherInfo)
    User ( _id,  _name,  _password) public {
        id = _id;
        name = _name;
        password = _password;
        gender = _otherInfo[0];
        phoneNum = _otherInfo[1];
        preference = _otherInfo[2];
        education = _otherInfo[3];
        vocation = _otherInfo[4];
        economic = _otherInfo[5];
    }

    function createOrder (uint _orderId, uint _tenantId, uint8 _roomNum, uint[] _otherIntInfo,
        bytes32[] _otherStrInfo) public {
        address newOrder = new Order(_orderId, _tenantId, _roomNum, _otherIntInfo, _otherStrInfo);
        orderList.push(newOrder);
        orderMapping[_orderId] = orderList[orderList.length - 1];
    }
}