
const DIVIDER = 2;

function convertForBinary(){
    var decimalInput = document.getElementById("decimalInput").value;
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

function limpar(){
    var resultadoElement = document.getElementById("resultado");
    resultadoElement.textContent = " ";
}