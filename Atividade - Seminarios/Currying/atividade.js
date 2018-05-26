var distanciaDestinoEPartida = (destino, partida) => {
    if(destino === "RECIFE" && partida === "CAMPINA GRANDE") {
        return 194.2;
    } else if(destino === "RIO DE JANEIRO" && partida === "CAMPINA GRANDE") {
        return 2318.4
    } else if(destino === "RIO DE JANEIRO" && partida === "SÂO PAULO") {
        return 434;
    }
}

var cauculaValor = (taxa,tributo,destino,partida) => {
    return (taxa*tributo) * distanciaDestinoToPartida(destino,partida);
}

calculadoraDeFrete = (taxa, tributo) => {

    return destino => {
        if(destino === "RECIFE" || destino === "RIO DE JANEIRO") {
            return destino;
        } else {
            return "Não trabalhamos com esse destino";
        }
        return partida => {
            if(partida === "CAMPINA GRANDE" || partida === "SÂO PAULO") {
                return calculaValor(taxa,tributo,destino,partida); //Retorna o valor do frete
            } else {
                return "Não trabalhamos com essa partida";
            }
        }
    }

}


var mercadoLivreFrete = calculadoraDeFrete(100, 25);


var valor = mercadoLivreFrete("RECIFE")("CAMPINA GRANDE");
console.log(valor)
valor = mercadoLivreFrete("RIO DE JANEIRO")("CAMPINA GRANDE");
console.log(valor)
valor = mercadoLivreFrete("RIO DE JANEIRO")("SÃO PAULO");
console.log(valor)