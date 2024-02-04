//@Author: Luiz Felipe
//@GitHub: https://github.com/LuizxxDev/Estudos-Java/tree/main/CalculatorBinary/FrontEnd

const DIVIDER = 2;

let currentFunction = convertForBinary;

function toggleFunction(){
    var resultadoElement = document.getElementById("resultado");
    var titleElement = document.getElementById("title-calculator");
    
    currentFunction = (currentFunction === convertForBinary) ? BinaryForDecimal : convertForBinary;
    
    resultadoElement.textContent = "";

    titleElement.textContent = (currentFunction === convertForBinary) ? "Decimal For Binary" : "Binary For Decimal";
}

function convertForBinary(){
    var decimalInput = document.getElementById("Input").value;
    var resultadoElement = document.getElementById("resultado");
    if(isNaN(decimalInput) || decimalInput === ""){
        alert('Por favor, insira um número decimal válido.');
            return;
    }

    var binary = "";

    while (decimalInput > 0) {
        let rest = decimalInput % DIVIDER;
        binary = rest + binary;
        decimalInput = Math.floor(decimalInput / DIVIDER);
    }
    resultadoElement.textContent = binary.toString();
}

function BinaryForDecimal(){
    
    var decimalInput = document.getElementById("Input").value;
    var resultadoElement = document.getElementById("resultado");

    if(isNaN(decimalInput)){
        alert("Por favor, insira um numero binario valido");
    }
    debugger;

    var arrayBinary = decimalInput.split('');
    var result = 0;

    for(let i = arrayBinary.length - 1; i >= 0; i--){
        result += parseInt(arrayBinary[i] * Math.pow(2, arrayBinary.length - 1 - i))
        resultadoElement.textContent = result.toString();
    }
}

function limpar(){
    var resultadoElement = document.getElementById("resultado");
    resultadoElement.textContent = " ";
}

function performConversion() {
    currentFunction();
}

