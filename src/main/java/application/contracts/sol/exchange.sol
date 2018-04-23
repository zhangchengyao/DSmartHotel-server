pragma solidity ^0.4.22;
pragma experimental ABIEncoderV2;

contract Exchange {
    function() public payable { }

    function confirmPayment(address _receiver, uint _amout) public returns(bool _success) {
        _receiver.transfer(_amout);
        return true;
    }

    function refund(address _payer, uint _amout) public returns(bool _success) {
        _payer.transfer(_amout);
        return true;
    }
}