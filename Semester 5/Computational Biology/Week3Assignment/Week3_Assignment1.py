"""
1. Translate a DNA sequence -> mRNA (using “U” instead of ”T”) -> into an aminoacid
sequence (protein)

Input DNA = TTACGA
Reverse complement = AATGCT
mRNA = AAUGCU
Aminoacid = Asn (N) – Ala (A)
"""

def validate_dna(dna_seq):
    seqm = dna_seq.upper()
    valid = seqm.count("A") + seqm.count("C") + seqm.count("G") + seqm.count("T")

    if valid == len(seqm):
        return True
    else:
        return False

def reverse_complement(dna_seq):
    """Computes the reverse complement of the DNA sequence."""
    comp = ""
    for c in dna_seq.upper():
        if c == "A":
            comp = "T" + comp
        elif c == "T":
            comp = "A" + comp
        elif c == "G":
            comp = "C" + comp
        elif c == "C":
            comp = "G" + comp
    return comp[::-1]

def convert_mRNA(dna_seq):
    mrna = dna_seq.replace("T", "U")
    print("mRNA =", mrna)

    aminoacid = []
    while mrna:
        aminoacid.append(mrna[:3])
        mrna = mrna[3:]
    return aminoacid

def translate_codonmrna(cod):
    tc = {
        "UUU": "Phe (F)",
        "UUC": "Phe (F)",
        "UUA": "Leu (L)",
        "UUG": "Leu (L)",

        "UCU": "Ser (S)",
        "UCC": "Ser (S)",
        "UCA": "Ser (S)",
        "UCG": "Ser (S)",

        "UAU": "Tyr (Y)",
        "UAC": "Tyr (Y)",
        "UAA": "STOP",
        "UAG": "STOP",

        "UGU": "Cys (C)",
        "UGC": "Cys (C)",
        "UGA": "STOP",
        "UGG": "Trp (W)",

        "CUU": "Leu (L)",
        "CUC": "Leu (L)",
        "CUA": "Leu (L)",
        "CUG": "Leu (L)",

        "CCU": "Pro (P)",
        "CCC": "Pro (P)",
        "CCA": "Pro (P)",
        "CCG": "Pro (P)",

        "CAU": "His (H)",
        "CAC": "His (H)",
        "CAA": "Gln (Q)",
        "CAG": "Gln (Q)",

        "CGU": "Arg (R)",
        "CGC": "Arg (R)",
        "CGA": "Arg (R)",
        "CGG": "Arg (R)",

        "AUU": "Ile (I)",
        "AUC": "Ile (I)",
        "AUA": "Ile (I)",
        "AUG": "Met (M)",

        "ACU": "Thr (T)",
        "ACC": "Thr (T)",
        "ACA": "Thr (T)",
        "ACG": "Thr (T)",

        "AAU": "Asn (N)",
        "AAC": "Asn (N)",
        "AAA": "Lys (K)",
        "AAG": "Lys (K)",

        "AGU": "Ser (S)",
        "AGC": "Ser (S)",
        "AGA": "Arg (R)",
        "AGG": "Arg (R)",

        "GUU": "Val (V)",
        "GUC": "Val (V)",
        "GUA": "Val (V)",
        "GUG": "Val (V)",

        "GCU": "Ala (A)",
        "GCC": "Ala (A)",
        "GCA": "Ala (A)",
        "GCG": "Ala (A)",

        "GAU": "Asp (D)",
        "GAC": "Asp (D)",
        "GAA": "Glu (E)",
        "GAG": "Glu (E)",

        "GGU": "Gly (G)",
        "GGC": "Gly (G)",
        "GGA": "Gly (G)",
        "GGG": "Gly (G)"
    }
    codonmrna = []
    for cod in cod:
        if cod in tc:
            codonmrna.append(tc[cod])
        else:
            codonmrna.append("X")
    return codonmrna



dna = "ttacga"
print("Input DNA =", dna.upper(), "\n")

if(validate_dna(dna) == True):
    reverse_comp = reverse_complement(dna)
    print("Reverse Complement =", reverse_comp)

    mrna_aminoacid = convert_mRNA(reverse_comp)
    codonmrna = translate_codonmrna(mrna_aminoacid)
    print("Aminoacid =", *codonmrna, sep = "\n" + "- ")