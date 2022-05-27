(ns meigen.db)

(def default-db
  {:todos {1 {:id 1 :title "豚肉を買ってくる" :completed true}
           2 {:id 2 :title "たまねぎを買ってくる" :completed true}
           3 {:id 3 :title "にんじんを買ってくる" :completed false}
           4 {:id 4 :title "じゃがいもを買ってくる" :completed false}
           5 {:id 5 :title "カレーを作る" :completed false}}})

[{:author  "レオナルド・ダ・ヴィンチ"
  :id      "7rYXN5rKbKLYy2vzUptL"
  :content "私は決して障害に屈しはしない。いかなる障害も、私の中に強い決意を生み出すまでだ。"}
 {:author  "野口英世"
  :id      "dQAHiXu7KE3ggG1lI4Qs"
  :content "努力だ。勉強だ。それが天才だ。誰よりも三倍、四倍、五倍勉強する者、それが天才だ。"}
 {:author  "トルストイ"
  :id      "1u3rke2ZCo0Jy3zAn89Q"
  :content "人間にとって最高の幸福は、一年の終わりにおける自己を、その一年の始めにおける遥かに良くなったと感ずることである。"}
 {:author  "織田信長"
  :id      "U94CdLA3R4yJYogdcwbz"
  :content "必死に生きてこそ、その生涯は光を放つ。"}
 {:author  "アインシュタイン"
  :id      "NJKNBegmlpQ9XjLJes9t"
  :content "昨日から学び、今日を懸命に生き、明日への希望を持て。大切なことは問うことをやめないことだ。"}
 {:author  "ポール・グレアム"
  :id      "XW6ObTDE8pi612flIUAF"
  :content "普通の奴らの上を行け"}
 {:author  "升田幸三"
  :id      "zN43dODzz68sfHM1KFVa"
  :content "踏まれても叩かれても、努力さえしつづけていれば、必ずいつかは実を結ぶ。"}
 {:author  "ベーブ・ルース"
  :id      "bHqIxPjJ4oPJLbvsYnf2"
  :content "決してギブアップしないヤツを打ち負かすことだけはできない。"}
 {:author  "アインシュタイン"
  :id      "RLrclLt6DorHjLecy0F5"
  :content "天才とは努力する凡才のことである。"}
 {:author  "松下幸之助"
  :id      "0Es9SgQL4mOjq1jAXmuF"
  :content "万策尽きたと思うな。自ら断崖絶壁の淵にたて。その時はじめて新たなる風は必ず吹く。"}
 {:author  "ガンジー"
  :id      "BcOlND7zCHS2XOpijFRp"
  :content "満足は努力の中にあって、結果にあるものではない。"}
 {:author  "ニーチェ"
  :id      "e0OXKuBGZYWn7QL9Ihgn"
  :content "高みに向かって努力を続けることは  決して無駄ではない"}
 {:author  "手塚治虫"
  :id      "v66au6vfC9rf7Kt1HHSz"
  :content "人を信じよ、しかし、その百倍も自らを信じよ。"}
 {:author  "プラトン"
  :id      "eiohedbWIVSysRJTC5t3"
  :content "自分に打ち勝つことが、最も偉大な勝利である。"}
 {:author  "キャロル・バーネット"
  :id      "ddd9jKPgt9AVrqmekOKb"
  :content "私の人生を変えられるのは私だけ。誰も私のためにそんなことやってくれないわ。"}
 {:author "", :id "vgVvQYAwdfE0vYSMJJKk", :content "人事を尽くして天命を待つ"}
 {:author  "ウィリアム･ジェームズ"
  :id      "aDHTKO3NTonmKbpzz5z6"
  :content "苦しいから逃げるのではない。逃げるから苦しくなるのだ。"}
 {:author  "アリストテレス"
  :id      "4vmcHe3rrUcrQEjX2A1T"
  :content "人間は、目標を追い求める動物である。目標へ到達しようと努力することによってのみ、人生が意味あるものとなる。"}
 {:author "アヴィーチ", :id "Y0m67JJgliu1Eo3lQeWM", :content "記憶に残る人生を歩め。"}
 {:author  "王 貞治"
  :id      "l2v2VfCgXpMWgGlyeqgM"
  :content "努力は必ず報われる。もし報われない努力があるのならば、それはまだ努力と呼べない。"}
 {:author  "リンカーン"
  :id      "VgbxJC6aOKeF7nUIhHJl"
  :content "意志あるところに道は開ける。"}
 {:author "スティーブ・ジョブズ"
  :id     "iHQKliVKqcyqFoM7zCTk"
  :content
  "過去ばかり振り向いていたのではダメだ。自分がこれまで何をして、これまでに誰だったのかを受け止めた上で、それを捨てればいい。"}
 {:author  "ゲーテ"
  :id      "7JyRt6VKbuDFxu7PLX60"
  :content "生きている間は、なにごとも延期するな。なんじの実行また実行であれ。"}
 {:author "ロマン・ロラン"
  :id     "8xcEY52i0scUovkeEEaE"
  :content
  "それは淋しい空地において、暗い闘いを行う烈々たる行動の松明である。失敗も勝利も問題ではない、行動だ！行動し、戦闘することが、虚無に対する唯一の肯定なのだ。"}
 {:auther "テスト", :content "テスト", :id "RYhtWxVFJ93hL4pX7r4e"}
 {:author  "ヴィクトル・ユーゴー"
  :id      "KXti3ir4xGVECGps7nGi"
  :content "人は強さに欠けているのではない。意志を欠いているのだ。"}
 {:author  "ロマン・ロラン"
  :id      "QCDmwgLyudIz6LBvZbWr"
  :content "私は虚無と戦う生命なのだ。私は闇に燃える火だ。私は永遠に戦う自由な意思だ。私といっしょに戦え。そして燃えるがよい。"}
 {:author  "ヴィクトール・フランクル"
  :id      "J68NBNGO8pMhKpdM5fAp"
  :content "意味は生存の歩調を定める。実存は、実存自体を超えた何物かへの超越性によって生きられない限り、躓く。"}
 {:author "ベートーベン", :id "KsyPunR1SZSsvk4LexUy", :content "苦悩を抜けて歓喜へ"}
 {:author  "イチロー"
  :id      "EBT5JLqVXHwsIju0s0EY"
  :content "小さなことを重ねることが、とんでもないところに行くただひとつの道。"}
 {:id "1gA4bviIYnXOywpMi2g2"}
 {:author  "福沢諭吉"
  :id      "y94PjSQw8vVzgRcgkwcJ"
  :content "進まざる者は必ず退き、退かざる者は必ず進む。"}
 {:author  "ニーチェ"
  :id      "L3i0Ef3jSo18gom9RmN2"
  :content "目的を忘れることは、愚かな人間にもっともありがちなことだ。"}
 {:author  "ルイ・アームストロング"
  :id      "UnoGZ31guUe7R2b0aNyx"
  :content "途中であきらめちゃいけない。途中であきらめてしまったら、得るものより失うものの方が、ずっと多くなってしまう。"}
 {:author  "エマーソン"
  :id      "AdxTE5XGDduewJlzvJ8k"
  :content "自分自身を最大限に利用しなさい。あなたにとって、あるのはそれだけなのですから。"}
 {:author  "ガンジー"
  :id      "Er6uatvGDenby9ax8Z5H"
  :content "人間は、その人の思考の産物にすぎない。人は思っている通りになる。"}
 {:author  "ビル・ゲイツ"
  :id      "8RGcYXklw9fncOdHezMn"
  :content "自分のことを、この世の誰とも比べてはいけない。それは自分自身を侮辱する行為だ。"}
 {:author  "ロマン・ロラン"
  :id      "FMnQSMplXzcRinweswWb"
  :content "苦しめ、死ね。しかし、お前があらねばならぬものであれ。人間であれ。"}
 {:author  "野村克也"
  :id      "4AelhjLutzQAmEn7b5io"
  :content "重荷があるからこそ、人は努力するのである。重荷があるからこそ、大地にしっかりと足をつけて歩いていける。"}
 {:author  "シェイクスピア"
  :id      "astPSenLgNGVHOqFX2SZ"
  :content "豊かさと平和は、臆病者をつくる。苦難こそ強さの母だ。"}
 {:author  "渋沢栄一"
  :id      "GTGuPpdfHPRJwBYyBKdb"
  :content "もうこれで満足だという時は、すなわち衰える時である。"}
 {:author  "アンドレ・ジッド"
  :id      "zRvkoQAkZQCIw8esgr6P"
  :content "平凡なことを毎日平凡な気持ちで実行することが、すなわち非凡なのである。"}
 {:author  "ドフトエフスキー"
  :id      "sTSAyeXpHlncG7NFCeAd"
  :content "苦しむこともまた才能の一つである。"}
 {:author  "坂本龍馬"
  :id      "Vt3TrZIf0YFsSNnavgls"
  :content "業なかばで倒れてもよい。そのときは、目標の方角にむかい、その姿勢で倒れよ。"}
 {:author  "井上 靖"
  :id      "w8s0UGxitccrwQJ2JF6i"
  :content "努力する人は希望を語り、怠ける人は不満を語る。"}
 {:author  "ウォルター･バジョット"
  :id      "9vNnUOmpf7MshAhxHISn"
  :content "人生における大きな喜びは、「君にはできない」と世間が言うことをやってのけることである。"}
 {:author  "シェイクスピア"
  :id      "3JgTfn66NEqHZ7kvc0CU"
  :content "とじこめられている火が、いちばん強く燃えるものだ。"}
 {:author  "スティーブ・ジョブス"
  :id      "CNG65KvJzb3vQAfx30Ln"
  :content "昔を振り返るのはここでやめにしよう。大切なのは明日何が起きるかだ。"}
 {:author  "ヘンリー・フォード"
  :id      "kVVk4zK95oBO3fsUtCIq"
  :content "努力が効果をあらわすまでには時間がかかる。多くの人はそれまでに飽き、迷い、挫折する。"}
 {:author  "ヴィクトル・ユーゴー"
  :id      "5kUI0At1YugUgGSMWMsR"
  :content "友よ、逆境にあっては、常にこう叫ばねばならない。「希望、希望、また希望」と。"}
 {:author  "キャサリン・アン・ポータ"
  :id      "1Jud26mhlAcEtwHGbk9B"
  :content "つらい道を避けないこと。自分の目指す場所にたどりつくためには進まなければ。"}
 {:author  "ヘレンケラー"
  :id      "4fxU4ehi3ZdU2WiVYF9R"
  :content "元気を出しなさい。今日の失敗ではなく、明日訪れるかもしれない成功について考えるのです。"}
 {:author  "ベートーベン"
  :id      "pLO4EX0FBiayLVry3XMF"
  :content "優れた人間は、どんなに不幸で苦しい境遇でも、黙って耐え忍ぶ。"}
 {:author "トーマス・エジソン", :id "9JjBQHVKOTeu99bIyTZc", :content "失敗は成功の母だ"}
 {:author "カール・ヒルティ"
  :id     "TdDLygOg6tQ4soreHT93"
  :content
  "苦しみは人間を強くするか、それとも打ち砕くかである。その人が自分の内に持っている素質に応じてどちらかになるのである。"}
 {:author  "坂本龍馬"
  :id      "VNuLuO9aAiUrNgtrdTmt"
  :content "世の人は我を何とも言わば言え、我が成すべきことは我のみぞ知る。"}
 {:author  "フランツ・ベッケンバウワー"
  :id      "aYNoeklhMMYAcppf8itg"
  :content "強い者が勝つのではない。勝った者が強いのだ。"}
 {:author  "ヴィクトル・ユーゴー"
  :id      "AFF9017bhS7dJA4E145F"
  :content "立派な人間は、天頂に星がきらめくときに、みずからの精神に火をともすのだ。"}
 {:author  "モハメドアリ"
  :id      "Fdoc7JdueK1uR06TJ2E9"
  :content "自分をダメだと思えば、その時点から自分はダメになる。"}
 {:author  "ウォルト・ディズニー"
  :id      "1O8HqDRDK42Fj3uA0HXI"
  :content "逆境の中で咲く花は、どの花よりも貴重で美しい。"}
 {:author  "野比のび太"
  :id      "Zb2CqLjadzXoehPSEisR"
  :content "いちばんいけないのはじぶんなんかだめだと思いこむことだよ。"}
 {:author  "吉田松蔭"
  :id      "gyWl9ntPbz7QZ7nDCKo4"
  :content "志を立てて以って万事の源と為す"}
 {:author  "幸田露伴"
  :id      "3BmCLJmDghgvTgH9J7wZ"
  :content "努力よりほかにわれわれの未来をよくするものはなく、また努力よりほかにわれわれの過去を美しくするものはないのである。"}
 {:author  "ガンジー"
  :id      "oqwN3TiPodV1mLNnqeMN"
  :content "喜びとは、勝利それ自体にではなく、途中の戦い、努力、苦闘の中にある。"}
 {:author  "ドストエフスキー"
  :id      "mR8Ii4LTMOQdURy7hrom"
  :content "地上に住むすべての人は、まず第一に生を愛さなければならないと思いますよ。"}
 {:author  "高杉晋作"
  :id      "y4CJIGaiJhxYqdO4pBf3"
  :content "真の楽しみは苦しみの中にこそある。"}
 {:author "バーナード・ショー"
  :id     "oo7971RdhRoZuDWyXOmA"
  :content
  "人間を賢くし人間を偉大にするものは、過去の経験ではなく、未来に対する期待である。なぜならば、期待をもつ人間は、何歳になっても勉強するからである。"}
 {:author  "ニーチェ"
  :id      "YO6mR2DcFt1VnccCSCTO"
  :content "何故生きるかを知っているものは、ほとんどあらゆる如何に生きるか、に耐えるのだ。"}
 {:author  "松下幸之助"
  :id      "jYu1KT5Orm58VvAEhYVw"
  :content "普通の努力では、チャンスをチャンスと見極められない。熱心の上に熱心であることが見極める眼を開く。"}
 {:author  "ヘミングウェイ"
  :id      "Zw9j17LLwMzgSTXCbwA7"
  :content "人間の価値は、絶望的な敗北に直面して、いかにふるまうかにかかっている。"}
 {:author  "マイケル・ジョーダン"
  :id      "IcYGrAb7wcwFEI7T9T8K"
  :content "目標を達成するには、全力で取り組む以外に方法はない。そこに近道はない。"}
 {:author  "流 音弥"
  :id      "I8Ey8MLzd9Z5kp7taiBn"
  :content "努力を癖にしてしまえば苦労せずに成功できるだろう。"}
 {:author  "松下幸之助"
  :id      "LiEtI7deQ7lnMH5957H9"
  :content "石の上にも三年という。しかし、三年を一年で習得する努力を怠ってはならない。"}
 {:author  "トーマス・エジソン"
  :id      "LLbZ3Xrr3FmfNtK8qkv7"
  :content "天才とは99％の努力と1％のひらめきであるの努力と1％のひらめきである。"}]
