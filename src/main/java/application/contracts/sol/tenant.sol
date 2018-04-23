pragma solidity ^0.4.23;
import "./user.sol";
import "./order.sol";
contract Tenant is User{
    bytes32 gender;
    bytes32 phoneNum;
    bytes32 preference;
    bytes32 education;
    bytes32 vocation;
    bytes32 economic;

    mapping(uint => address) public orderMapping;
    address[] public orderList;

    function Tenant(uint _id, bytes32 _name, bytes32 _password, bytes32[] _otherInfo)
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

    function setGender(bytes32 gen) public {
        gender = gen;
    }
    function getGender() public constant returns (bytes32 _gender) {
        return gender;
    }

    function setPhoneNum(bytes32 phone) public {
        phoneNum = phone;
    }
    function getPhoneNum() public constant returns (bytes32 _phoneNum) {
        return phoneNum;
    }

    function setPreference(bytes32 pre) public {
        preference = pre;
    }
    function getPreference() public constant returns (bytes32 _preference) {
        return preference;
    }

    function setEducation(bytes32 edu) public {
        education = edu;
    }
    function getEducation() public constant returns (bytes32 _education) {
        return education;
    }

    function setVocation(bytes32 vc) public {
        vocation = vc;
    }
    function getVocation() public constant returns (bytes32 _vocation) {
        return vocation;
    }

    function setEconomic(bytes32 ec) public {
        economic = ec;
    }
    function getEconomic() public constant returns (bytes32 _economic) {
        return economic;
    }

    function getAllOrders() public constant returns (address[] _orders) {
        return orderList;
    }
    function getOrder(uint id) public constant returns (address _order) {
        return orderMapping[id];
    }
}