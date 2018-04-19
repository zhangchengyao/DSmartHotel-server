pragma solidity ^0.4.0;
contract User {
    uint id;
    string name;
    string password;

    function User(uint _id, string _name, string _password) public {
        id = _id;
        name = _name;
        password = _password;
    }

    function setId(uint _id) public {
        id = _id;
    }
    function getId() public constant returns (uint _id) {
        return id;
    }

    function setName(string _name) public {
        name = _name;
    }
    function getName() public constant returns (string _name) {
        return name;
    }

    function setPassword(string pw) public {
        password = pw;
    }
    function getPassword() public constant returns (string _password) {
        return password;
    }
}