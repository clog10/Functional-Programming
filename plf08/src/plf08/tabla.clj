(ns plf08.tabla)

(defn tabla-polibio
  [c]
  (let [xs {\@ "♕♚"
            \` "♔♜"
            \! "♘♛"
            \A "♝♔"
            \a "♜♜"
            \Á "♛♜"
            \á "♜♞"
            \" "♘♚"
            \B "♛♞"
            \b "♜♝"
            \# "♘♖"
            \C "♛♝"
            \c "♜♛"
            \$ "♘♘"
            \D "♛♛"
            \d "♜♚"
            \% "♘♗"
            \E "♛♚"
            \e "♜♖"
            \& "♘♕"
            \F "♛♘"
            \f "♜♗"
            \' "♘♔"
            \G "♛♗"
            \g "♜♕"
            \( "♗♜"
            \H "♛♕"
            \h "♜♔"
            \) "♗♞"
            \I "♛♔"
            \i "♞♜"
            \É "♛♖"
            \é "♜♘"
            \* "♗♝"
            \+ "♗♛"
            \K "♚♜"
            \k "♞♞"
            \, "♗♚"
            \L "♚♞"
            \l "♞♝"
            \- "♗♖"
            \M "♚♝"
            \m "♞♛"
            \. "♗♘"
            \N "♚♛"
            \n "♞♚"
            \/ "♗♗"
            \O "♚♖"
            \o "♞♘"
            \0 "♖♕"
            \P "♚♗"
            \p "♞♕"
            \1 "♖♔"
            \Q "♚♕"
            \q "♞♔"
            \Ñ "♚♚"
            \ñ "♞♖"
            \2 "♘♜"
            \R "♚♔"
            \r "♝♜"
            \3 "♘♞"
            \S "♖♜"
            \s "♝♞"
            \Ó "♚♘"
            \ó "♞♗"
            \4 "♘♝"
            \T "♖♞"
            \t "♝♝"
            \5 "♔♖"
            \U "♖♝"
            \u "♝♛"
            \6 "♔♘"
            \V "♖♛"
            \v "♝♚"
            \7 "♔♗"
            \W "♖♚"
            \w "♝♖"
            \8 "♔♕"
            \X "♖♖"
            \x "♝♘"
            \9 "♔♔"
            \Y "♖♘"
            \y "♝♗"
            \: "♗♕"
            \Z "♖♗"
            \z "♝♕"
            \; "♗♔"
            \[ "♕♖"
            \{ "♔♞"
            \< "♕♜"
            \\ "♕♘"
            \| "♔♝"
            \= "♕♞"
            \] "♕♗"
            \} "♔♛"
            \> "♕♝"
            \^ "♕♕"
            \~ "♔♚"
            \? "♕♛"
            \_ "♕♔"
            "♗♛" \+
            "♛♛" \D
            "♕♝" \>
            "♘♗" \%
            "♖♗" \Z
            "♚♛" \N
            "♞♔" \q
            "♗♚" \,
            "♕♕" \^
            "♞♚" \n
            "♛♔" \I
            "♚♝" \M
            "♘♝" \4
            "♘♚" \"
            "♕♚" \@
            "♜♚" \d
            "♚♘" \Ó
            "♔♘" \6
            "♜♔" \h
            "♞♗" \ó
            "♗♞" \)
            "♕♘" \\
            "♞♛" \m
            "♜♖" \e
            "♕♛" \?
            "♜♛" \c
            "♝♘" \x
            "♚♞" \L
            "♕♗" \]
            "♛♜" \Á
            "♛♘" \F
            "♝♜" \r
            "♚♜" \K
            "♔♞" \{
            "♖♛" \V
            "♕♞" \=
            "♔♛" \}
            "♖♔" \1
            "♝♞" \s
            "♞♕" \p
            "♕♔" \_
            "♞♝" \l
            "♛♗" \G
            "♖♘" \Y
            "♔♖" \5
            "♚♗" \P
            "♗♗" \/
            "♘♘" \$
            "♜♞" \á
            "♘♛" \!
            "♘♕" \&
            "♔♕" \8
            "♛♕" \H
            "♗♝" \*
            "♝♝" \t
            "♗♔" \;
            "♖♖" \X
            "♖♚" \W
            "♖♕" \0
            "♜♜" \a
            "♚♕" \Q
            "♔♜" \`
            "♜♗" \f
            "♔♝" \|
            "♞♜" \i
            "♝♚" \v
            "♔♔" \9
            "♜♘" \é
            "♘♖" \#
            "♝♗" \y
            "♔♚" \~
            "♝♛" \u
            "♚♔" \R
            "♝♖" \w
            "♔♗" \7
            "♖♝" \U
            "♜♕" \g
            "♛♞" \B
            "♗♜" \(
            "♞♞" \k
            "♘♜" \2
            "♘♞" \3
            "♚♖" \O
            "♛♖" \É
            "♘♔" \'
            "♝♕" \z
            "♞♘" \o
            "♕♜" \<
            "♛♝" \C
            "♗♘" \.
            "♗♕" \:
            "♝♔" \A
            "♖♜" \S
            "♞♖" \ñ
            "♜♝" \b
            "♚♚" \Ñ
            "♗♖" \-
            "♛♚" \E
            "♕♖" \[
            "♖♞" \T}
        v (fn [r] (cond
                    (or (= r \í) (or (= r \j)))  (get xs \i)
                    (or (= r \Í) (or (= r \J)))  (get xs \I)
                    (or (= r \ú) (or (= r \ü)))  (get xs \u)
                    (or (= r \Ú) (or (= r \Ü)))  (get xs \U)
                    :else
                    (get xs r r)))]
    (v c)))

(defn tabla-columnar
  [c]
  (let [xs {\@ 135
            \` 141
            \! 114
            \A 76
            \a 1
            \Á 77
            \á 2
            \" 115
            \B 78
            \b 3
            \# 116
            \C 79
            \c 4
            \$ 117
            \D 80
            \d 5
            \% 118
            \E 81
            \e 6
            \& 119
            \F 83
            \f 8
            \' 120
            \G 84
            \g 9
            \( 121
            \H 85
            \h 10
            \) 122
            \I 86
            \i 11
            \É 82
            \é 7
            \* 123
            \J 88
            \j 13
            \+ 124
            \K 89
            \k 14
            \, 125
            \L 90
            \l 15
            \- 126
            \M 91
            \m 16
            \Í 87
            \í 12
            \. 127
            \N 92
            \n 17
            \/ 128
            \O 94
            \o 19
            \0 109
            \P 96
            \p 21
            \1 110
            \Q 97
            \q 22
            \Ñ 93
            \ñ 18
            \2 111
            \R 98
            \r 23
            \3 112
            \S 99
            \s 24
            \Ó 95
            \ó 20
            \4 113
            \T 100
            \t 25
            \5 146
            \U 101
            \u 26
            \6 147
            \V 104
            \v 29
            \7 148
            \W 105
            \w 30
            \8 149
            \X 106
            \x 31
            \Y 107
            \y 32
            \: 129
            \Z 108
            \z 33
            \Ú 102
            \ú 27
            \; 130
            \[ 136
            \{ 142
            \< 131
            \\ 137
            \| 143
            \Ü 103
            \ü 28
            \= 132
            \] 138
            \} 144
            \> 133
            \^ 139
            \~ 145
            \? 134
            \_ 140}
        x (fn [s] (get xs s))]
    (x c)))
