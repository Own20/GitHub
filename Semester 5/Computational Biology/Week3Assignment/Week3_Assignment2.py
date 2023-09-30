"""
2. Provides the frequency of each RNA codon encoding a given aminoacid, in a DNA

Input Aminoacid = NAA
mRNA = AAUGCUAAU
AAU = 2
GCU = 1
"""

def translate_aminoacid(cod):
    #amino acids and their corresponding codons
    tc = {
        "A": ["GCT", "GCC", "GCA", "GCG"],
        "C": ["TGT", "TGC"],
        "D": ["GAT", "GAC"],
        "E": ["GAA", "GAG"],
        "F": ["TTT", "TTC"],
        "G": ["GGT", "GGC", "GGA", "GGG"],
        "H": ["CAT", "CAC"],
        "I": ["ATT", "ATC", "ATA"],
        "K": ["AAA", "AAG"],
        "L": ["TTA", "TTG", "CTT", "CTC", "CTA", "CTG"],
        "M": ["ATG"],
        "N": ["AAT", "AAC"],
        "P": ["CCT", "CCC", "CCA", "CCG"],
        "Q": ["CAA", "CAG"],
        "R": ["CGT", "CGC", "CGA", "CGG", "AGA", "AGG"],
        "S": ["TCT", "TCC", "TCA", "TCG", "AGT", "AGC"],
        "T": ["ACT", "ACC", "ACA", "ACG"],
        "V": ["GTT", "GTC", "GTA", "GTG"],
        "W": ["TGG"],
        "Y": ["TAT", "TAC"],
        "_": ["TAA", "TAG", "TGA"]
        }

    dna_seq = [""]

    for i in cod:
        if i not in tc:
            return ["Invalid"]

        dna_seq1 = []
        for codon in tc[i]:
            for seq in dna_seq:
                dna_seq1.append(seq + codon)
        
        dna_seq = dna_seq1

    return dna_seq

def freq(dna_seq):
    seq_count = {}
    for i in range(0, len(dna_seq) - 2, 3):
        seq = dna_seq[i:i+3]
        seq_count[seq] = seq_count.get(seq, 0) + 1

    return seq_count



aminoacid = "NAN"
print("Input Aminoacid =", aminoacid, "\n")

mrna = translate_aminoacid(aminoacid)
print("mRNA =", mrna[0].replace("T", "U"))

result = freq(mrna[0].replace("T", "U"))
print(*["- " + str(a) + ' = ' + str(b) for a, b in result.items()], sep = "\n")
