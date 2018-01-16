pragma solidity ^0.4.0;
contract User {
    uint public id;
    string public name;
    string public password;

    function User(uint _id, string _name, string _password) public {
        id = _id;
        name = _name;
        password = _password;
    }
}