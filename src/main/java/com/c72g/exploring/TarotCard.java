package com.c72g.exploring;

public enum TarotCard {

    FOOL(0),
    MAGICIAN(1),
    HIGH_PRIESTESS(2),
    EMPRESS(3),
    EMPEROR (4),
    HIEROPHANT(5),
    LOVERS(6),
    CHARIOT(7),
    STRENGTH(8),
    HERMIT(9),
    WHEEL_OF_FORTUNE(10),
    JUSTICE(11),
    HANGED_MAN(12),
    DEATH(13),
    TEMPERANCE(14),
    DEVIL(15),
    TOWER(16),
    STAR(17),
    MOON(18),
    SUN(19),
    JUDGEMENT(20),
    WORLD(21),
    ACE_OF_CUPS(22),
    TWO_OF_CUPS(23),
    THREE_OF_CUPS(24),
    FOUR_OF_CUPS(25),
    FIVE_OF_CUPS(26),
    SIX_OF_CUPS(27),
    EIGHT_OF_CUPS(28),
    NINE_OF_CUPS(29),
    TEN_OF_CUPS(30),
    PAGE_OF_CUPS(31),
    KNIGHT_OF_CUPS(32),
    QUEEN_OF_CUPS(33),
    KING_OF_CUPS(34),
    ACE_OF_SWORDS(35),
    TWO_OF_SWORDS(36),
    THREE_OF_SWORDS(37),
    FOUR_OF_SWORDS(38),
    FIVE_OF_SWORDS(39),
    SIX_OF_SWORDS(40),
    EIGHT_OF_SWORDS(41),
    NINE_OF_SWORDS(42),
    TEN_OF_SWORDS(43),
    PAGE_OF_SWORDS(44),
    KNIGHT_OF_SWORDS(45),
    QUEEN_OF_SWORDS(46),
    KING_OF_SWORDS(47),
    ACE_OF_PENTACLES(48),
    TWO_OF_PENTACLES(49),
    THREE_OF_PENTACLES(50),
    FOUR_OF_PENTACLES(51),
    FIVE_OF_PENTACLES(52),
    SIX_OF_PENTACLES(53),
    EIGHT_OF_PENTACLES(54),
    NINE_OF_PENTACLES(55),
    TEN_OF_PENTACLES(56),
    PAGE_OF_PENTACLES(57),
    KNIGHT_OF_PENTACLES(58),
    QUEEN_OF_PENTACLES(59),
    KING_OF_PENTACLES(60),
    ACE_OF_WANDS(61),
    TWO_OF_WANDS(62),
    THREE_OF_WANDS(63),
    FOUR_OF_WANDS(64),
    FIVE_OF_WANDS(65),
    SIX_OF_WANDS(66),
    EIGHT_OF_WANDS(67),
    NINE_OF_WANDS(68),
    TEN_OF_WANDS(69),
    PAGE_OF_WANDS(70),
    KNIGHT_OF_WANDS(71),
    QUEEN_OF_WANDS(72),
    KING_OF_WANDS(73),
    SEVEN_OF_CUPS(74),
    SEVEN_OF_SWORDS(75),
    SEVEN_OF_PENTACLES(76),
    SEVEN_OF_WANDS(77);


    public final int id;

    public  static TarotCard valueOfId(int id){
        for (TarotCard tarotCard : values()) {
            if(id == tarotCard.id)
                return tarotCard;
        }
        return null;

    }

    private  TarotCard(int id) {
        this.id = id;
    }
}
