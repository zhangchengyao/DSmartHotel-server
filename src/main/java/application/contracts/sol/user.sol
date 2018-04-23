pragma solidity ^0.4.22;
//pragma experimental ABIEncoderV2;

contract User {
    uint id;
    bytes32 name;
    bytes32 password;
    string[] chatFilesHashAndName;

    function User(uint _id, bytes32 _name, bytes32 _password) public {
        id = _id;
        name = _name;
        password = _password;
    }

    function setId(uint _id) public {
        id = _id;
    }
    function getId() public constant returns (uint ) {
        return id;
    }

    function setName(bytes32 _name) public {
        name = _name;
    }
    function getName() public constant returns (bytes32 ) {
        return name;
    }

    function setPassword(bytes32 _password) public {
        password = _password;
    }
    function getPassword() public constant returns (bytes32 ) {
        return password;
    }

    function setChatFilesHashAndName(string[] _chatFilesHashAndName) public {
        chatFilesHashAndName = _chatFilesHashAndName;
    }
    function getChatFilesHashAndName() public constant returns (string[] ) {
        return chatFilesHashAndName;
    }

    function pay(address _exchange, uint _amout) public returns(bool _success) {
        _exchange.transfer(_amout);
    return true;
    }

    function() public payable { }
}