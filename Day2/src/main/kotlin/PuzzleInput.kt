val sample = listOf(
    "7 6 4 2 1",
    "1 2 7 8 9",
    "9 7 6 2 1",
    "1 3 2 4 5",
    "8 6 4 4 1",
    "1 3 6 7 9"
)

val input = listOf(
    "40 42 45 46 49 47",
    "65 66 68 71 72 72",
    "44 46 49 52 55 59",
    "62 63 66 68 71 74 80",
    "20 23 25 24 26",
    "37 38 35 38 39 38",
    "82 83 80 82 83 83",
    "69 72 75 74 77 79 83",
    "23 26 24 27 34",
    "59 62 62 65 67",
    "21 24 24 27 30 32 29",
    "56 57 58 59 59 62 62",
    "72 75 77 77 81",
    "79 81 81 83 86 93",
    "6 8 11 12 16 17",
    "13 16 20 23 24 21",
    "85 86 88 92 92",
    "74 76 78 82 85 88 92",
    "3 5 6 8 12 18",
    "48 51 54 61 63",
    "48 51 56 58 61 63 65 64",
    "13 14 19 20 23 23",
    "25 27 34 35 36 40",
    "59 61 64 67 68 73 74 81",
    "61 60 62 64 66 67 68",
    "19 17 18 21 20",
    "94 92 95 97 98 98",
    "75 72 74 75 78 82",
    "49 48 50 51 56",
    "42 39 40 41 40 41 44",
    "42 40 42 41 42 40",
    "70 67 64 66 66",
    "50 48 49 48 51 55",
    "66 65 68 66 67 69 75",
    "91 88 88 89 90 91 92",
    "28 25 27 29 29 31 32 31",
    "77 74 75 75 75",
    "86 83 85 85 88 92",
    "26 23 24 24 27 33",
    "48 45 47 51 54 56 58",
    "43 41 42 43 46 50 49",
    "20 19 22 25 26 30 30",
    "11 10 14 15 19",
    "19 17 20 23 26 30 37",
    "23 20 21 24 26 31 34 36",
    "94 91 96 99 97",
    "88 86 88 89 92 98 98",
    "19 16 18 21 27 29 32 36",
    "69 66 67 69 75 80",
    "2 2 3 6 7 8 9 10",
    "69 69 70 72 74 75 76 75",
    "23 23 26 29 29",
    "15 15 17 19 21 22 24 28",
    "34 34 35 38 44",
    "45 45 43 45 48",
    "52 52 54 56 54 57 56",
    "7 7 6 8 10 13 15 15",
    "81 81 84 83 87",
    "65 65 63 65 70",
    "23 23 24 25 25 27 29",
    "20 20 22 22 19",
    "2 2 4 6 6 6",
    "45 45 48 49 52 55 55 59",
    "74 74 76 76 79 82 87",
    "4 4 8 11 12 14",
    "38 38 41 43 47 44",
    "80 80 81 83 87 87",
    "3 3 6 8 10 12 16 20",
    "31 31 32 36 42",
    "81 81 82 88 91 94 97 98",
    "36 36 37 38 44 41",
    "2 2 3 8 8",
    "63 63 69 72 76",
    "2 2 7 10 15",
    "19 23 26 29 31 32",
    "51 55 56 59 62 65 63",
    "52 56 59 60 62 64 64",
    "71 75 77 79 81 85",
    "7 11 12 15 18 21 26",
    "32 36 33 36 37 40 43 46",
    "40 44 42 43 46 48 51 49",
    "14 18 21 24 21 21",
    "27 31 29 30 32 34 38",
    "56 60 61 64 66 69 66 72",
    "73 77 79 79 81 83 84",
    "5 9 10 13 14 14 17 16",
    "33 37 38 41 41 41",
    "64 68 70 70 73 77",
    "34 38 40 42 43 43 48",
    "46 50 53 55 59 62",
    "71 75 79 82 79",
    "38 42 46 49 51 51",
    "59 63 66 70 74",
    "82 86 90 91 97",
    "22 26 28 33 36 37",
    "64 68 73 76 74",
    "65 69 71 72 78 78",
    "20 24 27 30 36 40",
    "65 69 72 75 77 83 84 89",
    "6 13 16 18 20",
    "32 39 41 43 44 42",
    "52 57 59 61 64 66 66",
    "80 87 90 91 93 95 99",
    "22 29 32 35 38 43",
    "86 92 94 91 92",
    "81 87 88 89 87 88 86",
    "22 27 28 31 33 30 32 32",
    "7 13 15 14 18",
    "52 59 60 61 58 64",
    "32 38 38 41 44 47 49",
    "25 32 33 34 34 35 36 35",
    "68 73 75 75 77 80 82 82",
    "79 84 87 87 91",
    "25 30 31 34 35 35 42",
    "2 7 9 13 15 17 18 19",
    "11 18 22 23 22",
    "4 9 12 13 16 18 22 22",
    "48 53 54 58 61 65",
    "11 16 20 21 24 29",
    "10 15 22 24 26",
    "6 12 14 21 23 26 24",
    "55 60 61 64 65 72 72",
    "64 70 72 74 76 82 85 89",
    "28 34 40 42 44 45 46 51",
    "19 16 15 13 16",
    "30 29 27 26 26",
    "78 77 74 71 70 66",
    "70 68 67 66 65 62 60 55",
    "74 72 70 72 71 68 67 65",
    "80 79 82 80 83",
    "46 43 41 38 37 38 38",
    "55 54 56 55 51",
    "79 77 76 74 73 74 67",
    "32 30 30 29 28 25 23",
    "43 42 42 41 39 37 34 36",
    "30 28 26 26 24 24",
    "33 31 29 29 26 22",
    "94 91 89 86 86 80",
    "39 38 35 33 30 26 25 23",
    "36 34 32 30 29 26 22 25",
    "17 15 14 12 8 5 5",
    "33 32 31 27 24 23 19",
    "44 42 38 36 33 30 23",
    "92 90 83 82 80",
    "24 21 15 12 15",
    "88 85 83 77 74 73 73",
    "31 29 27 21 17",
    "78 75 70 69 68 61",
    "60 62 60 57 55",
    "92 95 94 91 94",
    "66 67 64 62 62",
    "67 70 67 64 60",
    "49 52 51 49 47 46 41",
    "94 95 97 94 93 90",
    "85 86 85 84 87 86 87",
    "40 43 40 39 41 38 38",
    "82 83 80 83 82 78",
    "95 97 99 96 90",
    "94 96 95 93 93 90",
    "29 31 31 28 27 30",
    "49 51 49 47 45 45 44 44",
    "16 19 19 16 15 13 12 8",
    "12 13 13 12 5",
    "59 61 57 55 54",
    "34 37 36 32 34",
    "45 47 43 42 41 41",
    "80 81 78 77 73 70 69 65",
    "88 91 90 86 79",
    "60 63 60 59 56 49 48",
    "83 85 83 81 80 74 72 73",
    "94 95 92 87 86 83 82 82",
    "67 70 69 67 60 56",
    "32 34 32 26 19",
    "25 25 22 21 18",
    "25 25 24 23 24",
    "82 82 81 80 77 74 71 71",
    "87 87 85 83 79",
    "27 27 26 24 17",
    "66 66 69 66 63",
    "73 73 70 67 64 67 66 69",
    "90 90 93 90 88 88",
    "77 77 74 75 71",
    "57 57 56 57 54 52 50 43",
    "29 29 28 25 25 22",
    "52 52 50 50 53",
    "19 19 19 16 14 12 9 9",
    "73 73 70 69 67 67 65 61",
    "96 96 93 90 88 88 82",
    "18 18 14 12 10 7 6 4",
    "27 27 23 22 20 19 17 19",
    "21 21 20 17 15 11 11",
    "92 92 89 85 82 79 75",
    "38 38 37 33 31 28 22",
    "15 15 13 7 4 3 2",
    "58 58 53 52 55",
    "70 70 69 64 64",
    "39 39 37 34 33 26 23 19",
    "49 49 42 41 34",
    "80 76 73 70 67",
    "79 75 73 70 67 70",
    "27 23 20 19 18 15 12 12",
    "92 88 87 84 81 78 77 73",
    "81 77 75 73 71 65",
    "67 63 66 65 63",
    "60 56 58 55 52 54",
    "98 94 96 95 95",
    "87 83 86 85 84 80",
    "35 31 33 31 24",
    "41 37 37 34 31",
    "26 22 20 17 16 16 18",
    "63 59 58 58 56 56",
    "96 92 89 86 86 82",
    "90 86 85 84 84 77",
    "22 18 14 13 10 8 6",
    "71 67 66 62 64",
    "71 67 65 62 60 56 56",
    "97 93 90 86 82",
    "35 31 27 25 19",
    "96 92 89 87 80 78 76 74",
    "69 65 58 57 55 53 55",
    "19 15 14 8 5 5",
    "72 68 67 64 62 60 54 50",
    "80 76 75 70 63",
    "32 27 25 24 21",
    "88 83 82 80 77 75 72 74",
    "82 76 73 72 72",
    "87 82 81 79 76 75 71",
    "99 93 90 89 86 81",
    "23 18 16 15 13 12 14 13",
    "82 77 75 72 69 71 74",
    "21 16 13 14 11 9 9",
    "67 62 60 63 60 56",
    "98 92 95 93 91 88 81",
    "14 9 9 8 6 3 2",
    "27 20 18 18 21",
    "20 13 13 11 11",
    "36 30 28 26 23 23 19",
    "51 46 46 45 38",
    "62 57 55 51 50 48",
    "45 38 34 31 33",
    "24 19 17 14 10 8 8",
    "88 81 77 76 74 70",
    "54 47 44 40 37 35 29",
    "90 83 80 78 71 68 65",
    "35 30 23 20 19 22",
    "76 69 63 60 58 57 57",
    "81 74 72 65 62 58",
    "29 24 21 20 13 10 5",
    "58 55 56 56 53",
    "43 40 38 33 30",
    "90 86 85 86 85 84 82 84",
    "46 50 53 51 52 56",
    "83 82 81 79 77 73 68",
    "56 60 63 66 68 70 73 77",
    "48 44 43 38 36 35 31",
    "61 54 53 51 52 45",
    "1 4 4 7 8 10 13",
    "35 41 43 48 48",
    "22 25 26 27 28 31 31",
    "4 8 11 11 18",
    "71 73 76 80 83",
    "42 47 50 51 55 57 60",
    "7 7 4 7 8 9 8",
    "64 64 62 61 59 60 63",
    "70 66 64 62 60 63 63",
    "13 10 13 18 23",
    "18 20 21 23 29 30 31 38",
    "38 38 41 40 44",
    "31 34 32 29 26 26",
    "46 44 46 49 51 53 60 64",
    "22 29 32 33 31 33 37",
    "34 34 28 26 25 24",
    "92 91 88 90 90",
    "18 17 19 20 23 23",
    "31 31 28 24 22 21 16",
    "84 83 80 76 76",
    "60 61 64 65 68 72",
    "57 54 58 60 63 66",
    "74 73 66 65 62 55",
    "52 54 53 48 42",
    "86 83 80 77 75 71 69",
    "50 46 45 44 47 45 42",
    "42 42 45 43 41 38 35 29",
    "37 34 37 40 40 44",
    "96 95 94 92 93 90 84",
    "7 4 7 9 7 8 15",
    "58 52 55 53 53",
    "37 41 43 50 52 54 52",
    "60 64 65 69 70 73 74 74",
    "61 61 58 61 59 56 53 49",
    "44 44 41 40 37 31 27",
    "46 50 50 53 55 56 54",
    "25 27 28 27 25 23 21 20",
    "96 96 93 91 88 87 81 74",
    "80 80 81 79 76",
    "53 58 65 66 63",
    "82 75 74 76 75 71",
    "12 11 16 18 18",
    "5 9 11 12 15 20 24",
    "36 32 30 30 28 25 26",
    "15 19 21 26 28 28",
    "61 59 62 63 65 66 69 72",
    "17 22 24 25 27 29",
    "76 74 73 70 64 64",
    "76 72 70 66 64 61 57",
    "12 14 13 10 7 2 3",
    "24 27 26 24 24 23",
    "11 9 10 10 10",
    "88 84 80 79 78 73",
    "90 87 89 89 96",
    "69 67 70 73 70 73 74",
    "63 67 69 74 75 78",
    "27 23 19 17 15 13 10",
    "46 52 53 54 54 56 62",
    "41 35 33 31 30 25 25",
    "8 7 11 12 17",
    "6 6 6 8 9 12 13 13",
    "13 20 25 28 30 33",
    "89 84 82 81 80",
    "41 48 52 53 55 55",
    "48 49 51 52 53 56",
    "92 91 89 88 86 83 82",
    "68 69 72 75 78",
    "89 90 92 94 95",
    "10 13 16 19 22",
    "88 87 86 83 80 77",
    "42 45 46 49 50 53",
    "31 28 26 24 21 20 17",
    "30 29 26 24 23",
    "90 89 87 84 83 82 81",
    "1 4 7 9 12 13",
    "52 53 56 57 58 60",
    "27 24 23 21 18",
    "2 3 5 7 10 12 15",
    "73 75 77 79 82",
    "78 79 82 85 88",
    "74 71 69 68 66 63 60",
    "23 24 27 29 30 33 34 35",
    "54 53 51 48 45 43",
    "30 33 35 36 39 40",
    "82 81 79 77 76",
    "88 87 85 84 82 81",
    "15 17 19 22 24 25 27",
    "26 24 22 21 20 18 17 16",
    "18 15 12 9 8",
    "32 33 36 39 41",
    "72 69 66 65 62 61 59 56",
    "84 83 82 79 78",
    "13 14 16 18 21",
    "67 66 63 62 59 56",
    "57 58 61 62 63 65",
    "14 12 10 8 7 5 3",
    "22 24 26 28 30 32 34 36",
    "65 62 61 58 57 54",
    "30 27 24 23 21 20 18 17",
    "69 68 66 65 63 62",
    "63 65 68 70 73 76 79 81",
    "32 35 38 40 41 42 45 47",
    "98 97 94 93 90 88 87",
    "7 8 10 13 15",
    "15 16 18 21 24 27 30 31",
    "23 24 26 28 30 31 34",
    "82 79 78 75 74 72",
    "70 73 76 78 81 84 85 87",
    "51 48 47 46 45 43 42",
    "48 45 42 39 38 37",
    "35 33 31 30 29",
    "24 26 27 29 32 35",
    "33 30 27 25 22 21 20",
    "17 20 23 26 27 30 32",
    "34 32 30 28 25 23",
    "30 31 33 35 37 39 42 43",
    "17 18 19 20 23 25",
    "52 54 55 56 58 61 62",
    "31 28 27 25 23 22 21 18",
    "42 44 46 47 48",
    "98 97 94 91 89",
    "57 54 52 50 48 45 44 43",
    "23 20 17 16 14 13 10 7",
    "47 49 52 53 55 56 57 59",
    "57 58 60 61 64 66 69 70",
    "70 72 74 76 79",
    "74 77 80 81 82",
    "27 24 22 19 16 14",
    "32 30 28 27 24 22",
    "72 71 70 68 66 63 61 60",
    "40 37 34 31 29 27 25",
    "15 13 12 10 9",
    "19 17 14 12 9 7 4 2",
    "84 82 79 76 73 72",
    "49 48 45 43 42 40 37",
    "68 65 62 61 60 59 56",
    "46 45 43 40 37",
    "79 76 75 74 73",
    "34 36 37 38 39 40 42",
    "70 72 74 75 77 78 81 83",
    "52 54 56 58 59",
    "33 35 38 40 43 46 47",
    "64 66 68 70 72 75",
    "46 45 42 40 37",
    "47 44 43 42 41 40 37 36",
    "85 82 80 77 76 74",
    "36 37 40 41 43 45 48",
    "39 42 44 47 49 51",
    "31 32 34 36 37",
    "52 55 58 60 62 65",
    "42 45 47 48 51 54 55 58",
    "11 10 8 7 6 3",
    "11 13 14 17 19",
    "92 89 86 83 81 79",
    "77 80 81 84 85 86 88",
    "44 46 49 50 52",
    "27 29 32 34 37",
    "84 85 87 89 92 94",
    "71 74 75 77 80",
    "47 49 52 53 55",
    "70 71 74 76 79",
    "14 17 18 20 22 23",
    "93 92 90 88 86 83",
    "92 91 89 87 85 82 80 78",
    "44 43 42 39 38 36 33 31",
    "27 26 23 22 20",
    "56 55 52 50 47 46 44 41",
    "83 82 81 80 78 76 73 70",
    "39 37 36 34 32 30",
    "22 23 26 29 32 33 35",
    "17 19 22 25 27 29",
    "92 91 90 89 88",
    "83 82 81 80 78 77",
    "45 43 42 41 40",
    "41 44 47 49 50 52 54",
    "62 63 66 68 71 73 76",
    "56 54 51 50 49",
    "21 19 17 15 12 10",
    "20 17 16 13 12 11 9",
    "81 82 84 85 86 89",
    "57 60 62 65 68 71 74",
    "29 27 25 24 21 19",
    "75 72 71 68 65 64",
    "20 17 14 12 9 6 3",
    "90 89 88 86 83 80 78",
    "80 81 82 83 86 87 88",
    "66 69 71 74 76 77 80",
    "43 40 37 35 32 30 27 26",
    "68 66 64 62 59 56",
    "42 45 47 48 49 50 52 55",
    "20 17 16 13 11 8 6 5",
    "29 30 32 34 37 40",
    "48 50 52 55 56 59 62 64",
    "86 87 90 91 92",
    "25 28 29 30 32 35 38",
    "28 26 23 22 20 19",
    "72 69 68 66 63 60 59",
    "83 82 79 76 74 73 71",
    "60 59 58 55 53",
    "8 10 12 15 17 18 19 21",
    "20 23 25 28 31 32 34 37",
    "77 75 72 69 67",
    "21 20 19 16 13",
    "25 24 23 22 21 19 16 13",
    "77 76 75 72 70",
    "56 53 52 51 50 49 47",
    "39 40 41 42 43 44",
    "55 58 61 63 65 67 69",
    "57 54 51 48 47 46",
    "76 74 73 72 69 66",
    "38 39 41 43 44 46",
    "15 16 19 21 22 23 26 27",
    "20 21 23 25 28 30 31 33",
    "40 37 36 33 30 29 26 23",
    "86 85 83 80 78 76 75",
    "47 48 50 51 54 57",
    "86 85 84 83 81 80 77 75",
    "62 63 66 68 71",
    "53 52 50 49 48 47 44 41",
    "97 94 91 88 85 82 79",
    "37 39 42 44 45",
    "90 87 85 83 80 78 75",
    "92 89 86 84 82 79 77 74",
    "86 83 80 78 76 74 72 71",
    "75 76 79 80 82 85 88",
    "38 40 42 44 45 46 48",
    "49 50 52 54 57",
    "11 14 16 19 22 23",
    "23 21 20 17 14",
    "51 53 54 57 60 61 63",
    "37 36 33 31 30 29 28 27",
    "25 22 21 18 16 14 13 10",
    "57 58 61 62 63 64",
    "87 89 91 94 96",
    "87 90 92 93 96",
    "89 87 84 81 80 79 76 73",
    "97 95 94 92 91",
    "86 85 83 80 79",
    "28 26 23 21 19 16 14",
    "83 81 79 76 74 71 70 67",
    "85 88 89 90 92",
    "49 51 52 54 56 57 58",
    "49 46 43 42 39 37 34",
    "35 34 31 29 28 25",
    "20 18 17 16 13 11 8",
    "84 83 80 77 76 75",
    "33 31 28 27 25 24 21 19",
    "73 72 69 66 63 61 60 57",
    "52 51 50 47 45 44 41 38",
    "14 12 9 8 6",
    "38 40 42 44 46 47 48",
    "87 86 85 84 83",
    "67 70 73 74 77",
    "25 24 22 20 19 17",
    "36 33 31 30 28",
    "50 51 54 57 59 62 64 65",
    "34 35 37 40 43 46 48",
    "45 47 48 50 52 53 55",
    "4 7 9 10 13 16 19",
    "80 81 82 85 88 91",
    "71 69 66 65 64 61 60",
    "17 18 21 23 26 27",
    "22 23 24 25 28",
    "28 31 34 37 38 40",
    "15 12 9 7 6 4",
    "60 63 66 67 68 71",
    "19 20 21 22 24 27 28",
    "25 27 30 32 35 38 40",
    "91 90 89 87 86 84 81",
    "65 62 61 58 56 54 52",
    "80 77 75 72 71 69",
    "15 13 10 8 6 3 1",
    "37 36 34 32 29 27 24 22",
    "89 86 84 82 79",
    "67 65 64 61 58 55 52",
    "97 94 92 89 86",
    "56 59 62 65 66 67 69 70",
    "28 31 34 35 36 39",
    "13 15 16 17 18",
    "50 49 46 43 40 39 36 35",
    "28 31 34 36 37 39",
    "18 17 14 13 10 8",
    "23 21 19 17 15 12",
    "61 63 65 68 69",
    "12 13 14 17 20 21 23",
    "29 27 25 23 20",
    "62 59 58 55 54 53 51",
    "45 44 42 39 38 37 35",
    "65 62 59 58 57",
    "35 34 32 30 27",
    "46 43 41 39 36 34 31",
    "21 23 25 28 30 33 35",
    "51 50 48 47 44",
    "69 70 72 75 77",
    "97 95 93 91 89 86 83 81",
    "23 26 29 31 33 34",
    "88 85 84 81 80 78",
    "44 47 49 52 55 56",
    "69 70 72 73 76 78 79 82",
    "73 70 68 66 64 63 61 59",
    "65 68 70 72 74 75 76 77",
    "53 51 48 45 44 42 40 38",
    "94 92 90 89 88 86 83",
    "39 38 36 34 33",
    "38 39 41 43 45 47",
    "42 41 38 36 34",
    "89 88 87 86 85",
    "20 22 25 28 31 34",
    "83 81 79 76 74 73",
    "98 95 92 91 89 87",
    "79 77 75 72 70 68 67 66",
    "9 8 7 4 3",
    "10 11 12 13 15 17 20",
    "61 58 56 55 52 50",
    "31 34 36 39 41 44",
    "89 92 94 95 97 99",
    "48 49 52 53 54 55 56",
    "80 78 76 74 71 69 66",
    "34 33 31 30 27 26",
    "44 41 38 37 34 32",
    "56 54 53 52 49 47 44 43",
    "37 38 39 40 42",
    "87 89 91 94 96 99",
    "37 39 42 45 46",
    "19 18 15 13 10",
    "47 44 41 40 37 35 33 30",
    "49 50 51 54 57 58",
    "33 31 28 25 23 20 18",
    "48 50 53 55 57",
    "32 33 36 38 41 44 45",
    "45 43 41 39 38 36",
    "75 73 71 68 67",
    "61 64 66 68 71 72 75 76",
    "58 59 60 62 64 67 69",
    "78 80 83 84 87 89 92 95",
    "18 17 15 14 11 9 8",
    "44 47 50 53 54 57 58",
    "21 24 27 30 31",
    "74 72 71 70 68 65 62",
    "62 59 58 56 53",
    "59 61 64 65 67 68 71",
    "64 66 67 70 71 74",
    "66 65 63 62 61 58 55 53",
    "1 2 5 7 8 9 11 12",
    "67 65 62 59 57 54 52",
    "11 8 6 3 2",
    "76 73 72 69 68 67 65",
    "30 28 25 22 21 20",
    "43 40 38 37 35 34 32 31",
    "77 79 80 81 82 85 86 89",
    "74 72 69 67 66 63",
    "42 44 45 47 50 51 53",
    "16 13 10 7 6",
    "73 76 78 79 82 84 86",
    "28 31 33 34 36 38",
    "80 83 84 86 87 90 91 92",
    "49 51 52 53 55",
    "15 18 20 23 25",
    "3 6 9 10 13 16",
    "41 43 45 47 49",
    "10 13 16 19 20 21 22 25",
    "38 41 43 45 47 48 49",
    "78 79 81 83 85 86 88",
    "43 40 38 37 35 32 30",
    "89 86 84 83 82 79 77 75",
    "62 61 59 58 57 54 51",
    "78 77 74 72 69 68",
    "17 14 11 8 6 3 1",
    "44 46 48 50 53 56 59 60",
    "48 47 44 43 40",
    "75 73 71 69 66 63 60",
    "2 3 5 6 7 8 10",
    "57 59 61 62 65",
    "93 91 88 87 86",
    "19 18 15 13 11 8 6",
    "54 57 58 61 64 66 69",
    "52 49 46 43 40",
    "28 27 24 21 18 15 14",
    "28 26 23 21 20 17 16 14",
    "86 84 83 81 78 75 74 71",
    "37 40 41 43 44 45 48",
    "7 8 9 10 13 16 19",
    "41 38 36 33 31 30 27",
    "67 65 63 61 59 56",
    "41 39 38 35 33 32 29",
    "13 12 9 8 5 4",
    "22 24 25 27 29 30 33 36",
    "38 37 35 32 31 28 27",
    "18 20 22 24 25 26 29",
    "87 85 82 81 80 78",
    "65 64 62 61 59",
    "23 24 25 28 29 31",
    "80 79 77 75 74 71",
    "9 10 13 15 16 17 20 21",
    "25 28 29 32 33 36",
    "24 21 19 17 15",
    "22 24 27 28 31 34",
    "77 78 79 82 83 84 85 86",
    "61 62 64 65 67 70 73",
    "39 38 37 36 35 33 31 29",
    "84 86 88 91 92 95",
    "59 56 55 52 49 46 44",
    "25 23 21 19 18",
    "9 7 6 4 3",
    "25 28 30 32 33 35 36 38",
    "39 41 44 46 49 52 54",
    "26 25 22 19 18",
    "80 77 75 73 70",
    "30 27 24 21 20 19 16 14",
    "76 77 79 80 83",
    "27 26 24 22 19 17 14",
    "50 53 55 56 58 61 62",
    "45 44 43 40 39 38 35",
    "41 44 45 47 48 49",
    "15 13 10 8 6 4 1",
    "41 40 39 36 34 31",
    "61 60 57 56 55 53 52 51",
    "27 24 21 20 17",
    "19 18 17 14 11",
    "22 21 19 17 14 11 9",
    "39 36 33 31 28 27",
    "72 69 66 64 62 60",
    "15 17 18 20 21",
    "34 35 36 39 42 44",
    "11 12 13 16 17 20",
    "75 73 70 69 66 63 62 61",
    "87 85 82 80 77 75",
    "96 95 92 90 87 84",
    "79 81 83 84 86 89",
    "83 86 88 89 91 93 95",
    "27 24 23 22 20 17 16",
    "80 82 83 85 87 90",
    "21 22 23 25 26 28 30 31",
    "20 18 17 14 11 8 6",
    "68 65 63 62 60 58 56",
    "55 56 59 62 64 66 68",
    "18 16 15 13 10 8 5 3",
    "37 40 42 43 45 47 48",
    "97 94 91 90 87 85",
    "84 86 89 92 93 94",
    "92 89 87 86 84 82 80 78",
    "39 41 44 46 49 51 54 56",
    "47 49 51 53 54",
    "72 74 75 78 79 81",
    "4 6 9 12 14 16 18 21",
    "45 48 51 53 55",
    "78 80 82 84 86 87 88 90",
    "76 75 74 71 69",
    "42 40 38 35 32",
    "13 10 8 7 4 2 1",
    "67 64 62 59 56 53 50 49",
    "48 50 51 52 54 57 58",
    "2 3 6 7 9 10",
    "17 16 14 13 11 8 6",
    "52 50 49 48 47",
    "46 44 42 39 37 35",
    "4 6 7 9 10",
    "35 38 41 43 44 45 48",
    "55 54 52 49 47 45 44",
    "60 63 65 66 69",
    "62 59 57 56 54 52 51",
    "53 56 57 60 62 63",
    "79 77 75 74 72",
    "27 26 23 20 17 15",
    "76 77 80 81 82",
    "70 71 72 75 76 79 80",
    "58 57 55 53 51 48 46 44",
    "50 53 55 56 58 60",
    "55 56 59 61 63 64 66",
    "27 28 31 34 36 37 39",
    "40 39 38 35 32",
    "75 72 71 69 66 65 64",
    "32 34 36 37 39 41",
    "31 28 27 25 23 20 18",
    "48 46 43 42 39 38",
    "25 24 23 22 19 18 16 14",
    "51 54 56 58 59 62",
    "64 62 61 58 55 53",
    "32 34 36 38 39 41 42 43",
    "38 37 36 34 33",
    "10 11 13 14 16 19 22 25",
    "39 36 33 30 27 24 23 21",
    "32 34 35 36 38 41 42 43",
    "17 19 21 23 26 29 30 31",
    "64 65 67 70 71 72 73 76",
    "58 59 61 62 63",
    "99 96 93 91 89 86",
    "31 32 35 36 39 41 42",
    "96 95 92 90 89 87 84 82",
    "29 32 33 35 37 39 41",
    "57 55 53 51 48 46",
    "14 12 11 9 7 6",
    "26 27 29 32 35 36 37",
    "31 30 29 26 23 21",
    "53 54 57 58 61",
    "59 56 54 51 48 45 42 40",
    "39 42 44 45 47 50",
    "42 39 36 34 32 29 26 24",
    "66 63 62 61 58 56",
    "11 14 16 17 20 21 22 23",
    "73 72 70 69 68 65",
    "37 38 41 43 44",
    "47 49 51 53 56 57 58",
    "34 37 40 42 44 47",
    "76 79 82 85 87",
    "71 70 69 68 67 66 64 61",
    "28 26 25 22 20 17 14 13",
    "43 46 48 49 51",
    "20 18 16 15 13 11",
    "69 66 65 62 59",
    "18 19 20 23 25",
    "65 68 69 72 74 77 79 81",
    "25 23 22 20 18 16",
    "21 20 17 15 14 13 11 10",
    "10 13 15 16 18 19 20 22",
    "52 53 56 57 59 61 62 63",
    "21 24 27 30 32 35 37 40",
    "78 77 76 73 72 70 68 65",
    "59 57 55 52 49 46 45 44",
    "31 34 37 40 43 46 49 50",
    "71 69 68 65 63 62 60 58",
    "61 62 65 66 67 68",
    "49 51 54 57 58 59 61 63",
    "38 36 35 34 33 30 28 26",
    "84 86 89 91 92 94 95",
    "46 48 50 52 54 56",
    "53 50 49 47 46 43 40",
    "33 35 36 37 40 42",
    "23 21 20 19 18 17 14",
    "70 68 67 66 63 60",
    "87 89 90 92 95 98",
    "91 90 87 85 83 81",
    "82 83 86 88 90 93 95 97",
    "87 88 90 93 95",
    "88 91 92 93 94 97",
    "24 23 21 20 18 17",
    "63 66 67 69 72 74 76",
    "47 50 53 56 57 59 61",
    "29 27 26 24 22 20",
    "20 18 17 16 13 11 9 6",
    "43 46 47 50 52 55 57 59",
    "7 8 9 11 14 15",
    "69 66 65 62 60 58",
    "15 18 21 24 26",
    "97 94 92 91 88 86 85",
    "55 52 49 48 47",
    "48 49 50 51 54 56 59",
    "29 31 32 35 38 41 42 43",
    "83 85 87 89 92 93 96 99",
    "71 74 76 77 80 82 84 86",
    "29 26 23 22 20 19 17",
    "45 47 50 51 52 55 57",
    "32 31 30 29 27",
    "99 98 97 96 94 91 88",
    "21 20 17 14 12",
    "85 84 82 79 76 75",
    "71 74 77 78 81 82 85 87",
    "78 79 80 81 83",
    "85 86 89 91 92 93 94",
    "9 11 14 15 17 18",
    "10 11 13 15 17 18",
    "50 52 53 55 57",
    "29 30 33 36 38 41",
    "17 18 21 24 27 30 31",
    "49 50 51 54 55 57 59",
    "64 62 60 59 57 54 53 51",
    "57 60 63 66 69 70 72 74",
    "96 95 93 91 88 86",
    "87 85 82 80 78 76 74",
    "67 69 72 75 78 81",
    "18 20 21 23 24",
    "19 16 13 11 8 7 5 2",
    "60 61 62 63 65",
    "40 38 35 32 29 28 25",
    "86 87 89 91 92 93",
    "21 23 24 25 27 28 29",
    "20 23 25 28 31",
    "52 55 56 57 59",
    "4 7 9 10 12",
    "39 42 44 47 48 51",
    "12 15 18 21 24 26 29 32",
    "1 3 5 8 9 11 13",
    "14 17 20 21 22 25 26",
    "14 11 10 8 6 5 2",
    "21 23 24 27 30",
    "33 35 36 37 39",
    "35 32 31 28 25",
    "79 78 75 72 69",
    "33 35 37 38 39 42 44",
    "22 21 19 18 15 12 9 8",
    "66 65 64 63 62 61 59 58",
    "88 85 84 81 79 76 74",
    "73 71 68 66 65 62",
    "66 67 69 71 73",
    "51 49 47 46 45 44",
    "29 26 24 21 18 17 16",
    "21 20 19 16 15 13 11 10",
    "65 63 62 60 58 57",
    "67 65 64 62 59 56 55 52",
    "10 11 12 14 15",
    "71 68 66 65 63 61 58",
    "41 39 36 35 34 31 29 27",
    "95 92 91 89 88 87",
    "24 26 28 30 33 35 38",
    "88 90 91 93 96",
    "51 48 47 45 44",
    "68 65 64 63 61 59",
    "84 83 82 79 78 77 76",
    "32 30 28 25 23",
    "42 40 38 37 34",
    "29 28 25 22 19 16 13",
    "21 24 26 29 30 32 35 38",
    "57 59 60 61 62 65 67",
    "50 53 56 59 61 63 66 67",
    "56 58 60 62 63",
    "44 43 41 38 36 33",
    "14 11 10 9 6 5",
    "17 18 19 20 23 26",
    "45 46 48 51 53 54 56",
    "93 92 90 88 86 84",
    "42 40 39 37 36 35",
    "11 14 17 20 22",
    "55 52 51 50 49 47 46",
    "30 32 35 38 39 41 44",
    "57 60 61 64 67 69",
    "49 46 44 41 38",
    "28 26 24 23 22 20 19",
    "3 6 7 8 11 14 15 16",
    "74 71 68 67 65 64",
    "73 72 70 67 66 64",
    "32 31 28 26 24",
    "86 89 91 93 96 99",
    "91 93 96 98 99",
    "63 61 60 57 55 53 51 48",
    "55 54 51 50 47 46 45 44",
    "76 73 71 69 68 65",
    "61 64 67 69 71",
    "20 23 26 27 30 33 36 39",
    "47 50 52 55 58 59 60",
    "68 66 63 62 61 60",
    "14 13 10 9 8",
    "71 72 75 78 81 84 87",
    "43 44 45 47 49",
    "97 95 93 92 91 90 87",
    "27 25 22 20 19 18",
    "61 64 67 68 69",
    "92 89 87 84 81 79 76 75",
    "79 80 83 86 89 90 92 93",
    "20 21 23 26 28",
    "40 37 34 33 32 30 28 27",
    "16 15 14 11 10 8",
    "46 43 40 39 38",
    "42 45 46 48 49 51",
    "15 12 9 8 6 4 1",
    "21 18 15 14 11 10 8",
    "32 31 30 28 25",
    "66 67 70 73 76",
    "31 33 34 37 39 42 44",
    "77 79 80 82 83",
    "71 73 75 78 80 83 86",
    "14 17 20 21 23",
    "61 59 58 57 54 53 51 48",
    "17 18 21 22 25",
    "19 22 24 27 28 31",
    "62 65 66 68 71 74 76",
    "76 79 81 83 84",
    "33 31 28 27 24",
    "85 83 82 81 80 79 76 74",
    "72 71 69 66 63 62",
    "83 86 89 91 92 93 94",
    "61 64 67 68 70 71 73",
    "59 61 63 64 65 66 69 72",
    "25 22 19 18 16 15 14",
    "56 54 51 49 48 46",
    "64 65 67 68 69",
    "71 72 73 75 76 78 79",
    "67 70 71 73 74 77",
    "88 89 90 93 96 98",
    "33 34 35 38 40",
    "28 31 32 35 37",
    "73 72 70 69 67",
    "41 39 37 36 35",
    "67 64 63 60 57 56 55",
    "75 72 71 70 67 64 62",
    "91 92 95 96 97 99",
    "58 57 56 54 51",
    "38 39 40 41 42 44",
    "54 52 51 50 47",
    "42 39 38 36 35 33",
    "27 30 33 34 37",
    "73 72 71 69 67 66 63",
    "68 67 66 65 62 61",
    "16 13 11 10 8 7",
    "25 26 28 30 33 34 35 37",
    "65 62 60 59 58",
    "46 44 43 42 40 37 34",
    "31 28 27 26 24 21 18 16",
    "10 12 13 15 16 19 21 24",
    "45 48 51 54 57 59 62 64",
    "84 87 90 92 94 96",
    "80 82 84 87 89 90",
    "17 18 19 20 23",
    "77 80 83 86 88 90",
    "40 37 35 33 31 30 28",
    "76 73 72 70 68 67 66 64",
    "53 54 56 59 60",
    "21 24 25 27 30 33 35",
    "59 57 54 53 52 49 46 45",
    "46 45 43 40 39 36 33",
    "49 46 43 42 41",
    "30 32 33 36 37 38 41 42",
    "15 12 10 8 5",
    "93 90 89 86 83 82 79 78",
    "63 64 66 68 71 72 75",
    "39 40 43 45 47",
    "42 39 37 35 32 31 28",
    "51 53 55 58 61 62",
    "59 56 55 52 51",
    "40 37 35 34 32 30 29 28",
    "31 33 34 36 39 42 43",
    "90 91 93 94 95 98",
    "33 34 37 39 42 45 48",
    "62 64 65 66 67 69",
    "65 62 61 60 57",
    "86 83 80 77 76",
    "74 73 72 71 69 67",
    "23 24 26 29 30",
    "19 17 15 12 10 7",
    "99 98 97 96 94",
    "22 23 25 28 30 33 35",
    "59 62 64 66 67",
    "24 21 19 18 16 15 14 11",
    "10 8 6 5 4 2 1",
    "87 85 83 80 79 77 74 73",
    "23 26 28 29 30 31",
    "14 16 19 22 25",
    "41 42 45 46 47 49",
    "78 81 82 85 87",
    "66 64 63 61 59 56 54",
    "16 15 12 10 7",
    "84 82 79 77 76 74",
    "81 82 84 85 88 91 92",
    "86 83 81 80 77 74",
    "81 83 86 88 89"
)