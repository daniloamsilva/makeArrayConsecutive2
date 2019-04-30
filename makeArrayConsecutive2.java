int makeArrayConsecutive2(int[] statues) {
    
    // Contagem das estátuas restantes
    int additional = 0;
    
    // Ordena em ordem crescente
    Arrays.sort(statues);
    
    // Laço para percorrer o array
    for (int x = 0; x < statues.length - 1; x++){
        // O cálculo verifica o intervalo entre os números e subtrai 1 em caso de números adjacentes
        additional += (statues[x+1] - statues[x]) - 1;
    }
    
    // Retorna o soma dos intervalos
    return additional;
    
}