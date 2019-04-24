public abstract class com.google.common.base.CharMatcher implements com.google.common.base.Predicate<java.lang.Character> {
  public static final com.google.common.base.CharMatcher ANY;

  public static final com.google.common.base.CharMatcher ASCII;

  public static final com.google.common.base.CharMatcher BREAKING_WHITESPACE;

  public static final com.google.common.base.CharMatcher DIGIT;

  public static final com.google.common.base.CharMatcher INVISIBLE;

  public static final com.google.common.base.CharMatcher JAVA_DIGIT;

  public static final com.google.common.base.CharMatcher JAVA_ISO_CONTROL;

  public static final com.google.common.base.CharMatcher JAVA_LETTER;

  public static final com.google.common.base.CharMatcher JAVA_LETTER_OR_DIGIT;

  public static final com.google.common.base.CharMatcher JAVA_LOWER_CASE;

  public static final com.google.common.base.CharMatcher JAVA_UPPER_CASE;

  public static final com.google.common.base.CharMatcher NONE;

  public static final com.google.common.base.CharMatcher SINGLE_WIDTH;

  public static final com.google.common.base.CharMatcher WHITESPACE;

  static {};
    Code:
       0: invokestatic  #118                // Method whitespace:()Lcom/google/common/base/CharMatcher;
       3: putstatic     #120                // Field WHITESPACE:Lcom/google/common/base/CharMatcher;
       6: invokestatic  #123                // Method breakingWhitespace:()Lcom/google/common/base/CharMatcher;
       9: putstatic     #125                // Field BREAKING_WHITESPACE:Lcom/google/common/base/CharMatcher;
      12: invokestatic  #128                // Method ascii:()Lcom/google/common/base/CharMatcher;
      15: putstatic     #130                // Field ASCII:Lcom/google/common/base/CharMatcher;
      18: invokestatic  #133                // Method digit:()Lcom/google/common/base/CharMatcher;
      21: putstatic     #135                // Field DIGIT:Lcom/google/common/base/CharMatcher;
      24: invokestatic  #138                // Method javaDigit:()Lcom/google/common/base/CharMatcher;
      27: putstatic     #140                // Field JAVA_DIGIT:Lcom/google/common/base/CharMatcher;
      30: invokestatic  #143                // Method javaLetter:()Lcom/google/common/base/CharMatcher;
      33: putstatic     #145                // Field JAVA_LETTER:Lcom/google/common/base/CharMatcher;
      36: invokestatic  #148                // Method javaLetterOrDigit:()Lcom/google/common/base/CharMatcher;
      39: putstatic     #150                // Field JAVA_LETTER_OR_DIGIT:Lcom/google/common/base/CharMatcher;
      42: invokestatic  #153                // Method javaUpperCase:()Lcom/google/common/base/CharMatcher;
      45: putstatic     #155                // Field JAVA_UPPER_CASE:Lcom/google/common/base/CharMatcher;
      48: invokestatic  #158                // Method javaLowerCase:()Lcom/google/common/base/CharMatcher;
      51: putstatic     #160                // Field JAVA_LOWER_CASE:Lcom/google/common/base/CharMatcher;
      54: invokestatic  #163                // Method javaIsoControl:()Lcom/google/common/base/CharMatcher;
      57: putstatic     #165                // Field JAVA_ISO_CONTROL:Lcom/google/common/base/CharMatcher;
      60: invokestatic  #168                // Method invisible:()Lcom/google/common/base/CharMatcher;
      63: putstatic     #170                // Field INVISIBLE:Lcom/google/common/base/CharMatcher;
      66: invokestatic  #173                // Method singleWidth:()Lcom/google/common/base/CharMatcher;
      69: putstatic     #175                // Field SINGLE_WIDTH:Lcom/google/common/base/CharMatcher;
      72: invokestatic  #178                // Method any:()Lcom/google/common/base/CharMatcher;
      75: putstatic     #180                // Field ANY:Lcom/google/common/base/CharMatcher;
      78: invokestatic  #183                // Method none:()Lcom/google/common/base/CharMatcher;
      81: putstatic     #185                // Field NONE:Lcom/google/common/base/CharMatcher;
      84: return

  protected com.google.common.base.CharMatcher();
    Code:
       0: aload_0
       1: invokespecial #189                // Method java/lang/Object."<init>":()V
       4: return

  static java.lang.String access$100(char);
    Code:
       0: iload_0
       1: invokestatic  #194                // Method showCharacter:(C)Ljava/lang/String;
       4: areturn

  public static com.google.common.base.CharMatcher any();
    Code:
       0: getstatic     #198                // Field com/google/common/base/CharMatcher$Any.INSTANCE:Lcom/google/common/base/CharMatcher$Any;
       3: areturn

  public static com.google.common.base.CharMatcher anyOf(java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: tableswitch   { // 0 to 2
                     0: 70
                     1: 59
                     2: 41
               default: 32
          }
      32: new           #17                 // class com/google/common/base/CharMatcher$AnyOf
      35: dup
      36: aload_0
      37: invokespecial #209                // Method com/google/common/base/CharMatcher$AnyOf."<init>":(Ljava/lang/CharSequence;)V
      40: areturn
      41: aload_0
      42: iconst_0
      43: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      48: aload_0
      49: iconst_1
      50: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      55: invokestatic  #217                // Method isEither:(CC)Lcom/google/common/base/CharMatcher$IsEither;
      58: areturn
      59: aload_0
      60: iconst_0
      61: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      66: invokestatic  #221                // Method is:(C)Lcom/google/common/base/CharMatcher;
      69: areturn
      70: invokestatic  #183                // Method none:()Lcom/google/common/base/CharMatcher;
      73: areturn

  public static com.google.common.base.CharMatcher ascii();
    Code:
       0: getstatic     #224                // Field com/google/common/base/CharMatcher$Ascii.INSTANCE:Lcom/google/common/base/CharMatcher$Ascii;
       3: areturn

  public static com.google.common.base.CharMatcher breakingWhitespace();
    Code:
       0: getstatic     #226                // Field com/google/common/base/CharMatcher$BreakingWhitespace.INSTANCE:Lcom/google/common/base/CharMatcher;
       3: areturn

  public static com.google.common.base.CharMatcher digit();
    Code:
       0: getstatic     #229                // Field com/google/common/base/CharMatcher$Digit.INSTANCE:Lcom/google/common/base/CharMatcher$Digit;
       3: areturn

  public static com.google.common.base.CharMatcher forPredicate(com.google.common.base.Predicate<? super java.lang.Character>);
    Code:
       0: aload_0
       1: instanceof    #2                  // class com/google/common/base/CharMatcher
       4: ifeq          12
       7: aload_0
       8: checkcast     #2                  // class com/google/common/base/CharMatcher
      11: areturn
      12: new           #35                 // class com/google/common/base/CharMatcher$ForPredicate
      15: dup
      16: aload_0
      17: invokespecial #251                // Method com/google/common/base/CharMatcher$ForPredicate."<init>":(Lcom/google/common/base/Predicate;)V
      20: areturn

  public static com.google.common.base.CharMatcher inRange(char, char);
    Code:
       0: new           #38                 // class com/google/common/base/CharMatcher$InRange
       3: dup
       4: iload_0
       5: iload_1
       6: invokespecial #258                // Method com/google/common/base/CharMatcher$InRange."<init>":(CC)V
       9: areturn

  public static com.google.common.base.CharMatcher invisible();
    Code:
       0: getstatic     #261                // Field com/google/common/base/CharMatcher$Invisible.INSTANCE:Lcom/google/common/base/CharMatcher$Invisible;
       3: areturn

  public static com.google.common.base.CharMatcher is(char);
    Code:
       0: new           #44                 // class com/google/common/base/CharMatcher$Is
       3: dup
       4: iload_0
       5: invokespecial #264                // Method com/google/common/base/CharMatcher$Is."<init>":(C)V
       8: areturn

  public static com.google.common.base.CharMatcher isNot(char);
    Code:
       0: new           #50                 // class com/google/common/base/CharMatcher$IsNot
       3: dup
       4: iload_0
       5: invokespecial #267                // Method com/google/common/base/CharMatcher$IsNot."<init>":(C)V
       8: areturn

  public static com.google.common.base.CharMatcher javaDigit();
    Code:
       0: getstatic     #272                // Field com/google/common/base/CharMatcher$JavaDigit.INSTANCE:Lcom/google/common/base/CharMatcher$JavaDigit;
       3: areturn

  public static com.google.common.base.CharMatcher javaIsoControl();
    Code:
       0: getstatic     #275                // Field com/google/common/base/CharMatcher$JavaIsoControl.INSTANCE:Lcom/google/common/base/CharMatcher$JavaIsoControl;
       3: areturn

  public static com.google.common.base.CharMatcher javaLetter();
    Code:
       0: getstatic     #278                // Field com/google/common/base/CharMatcher$JavaLetter.INSTANCE:Lcom/google/common/base/CharMatcher$JavaLetter;
       3: areturn

  public static com.google.common.base.CharMatcher javaLetterOrDigit();
    Code:
       0: getstatic     #281                // Field com/google/common/base/CharMatcher$JavaLetterOrDigit.INSTANCE:Lcom/google/common/base/CharMatcher$JavaLetterOrDigit;
       3: areturn

  public static com.google.common.base.CharMatcher javaLowerCase();
    Code:
       0: getstatic     #284                // Field com/google/common/base/CharMatcher$JavaLowerCase.INSTANCE:Lcom/google/common/base/CharMatcher$JavaLowerCase;
       3: areturn

  public static com.google.common.base.CharMatcher javaUpperCase();
    Code:
       0: getstatic     #287                // Field com/google/common/base/CharMatcher$JavaUpperCase.INSTANCE:Lcom/google/common/base/CharMatcher$JavaUpperCase;
       3: areturn

  public static com.google.common.base.CharMatcher none();
    Code:
       0: getstatic     #290                // Field com/google/common/base/CharMatcher$None.INSTANCE:Lcom/google/common/base/CharMatcher$None;
       3: areturn

  public static com.google.common.base.CharMatcher noneOf(java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokestatic  #293                // Method anyOf:(Ljava/lang/CharSequence;)Lcom/google/common/base/CharMatcher;
       4: invokevirtual #296                // Method negate:()Lcom/google/common/base/CharMatcher;
       7: areturn

  public static com.google.common.base.CharMatcher singleWidth();
    Code:
       0: getstatic     #331                // Field com/google/common/base/CharMatcher$SingleWidth.INSTANCE:Lcom/google/common/base/CharMatcher$SingleWidth;
       3: areturn

  public static com.google.common.base.CharMatcher whitespace();
    Code:
       0: getstatic     #334                // Field com/google/common/base/CharMatcher$Whitespace.INSTANCE:Lcom/google/common/base/CharMatcher$Whitespace;
       3: areturn

  public com.google.common.base.CharMatcher and(com.google.common.base.CharMatcher);
    Code:
       0: new           #11                 // class com/google/common/base/CharMatcher$And
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #339                // Method com/google/common/base/CharMatcher$And."<init>":(Lcom/google/common/base/CharMatcher;Lcom/google/common/base/CharMatcher;)V
       9: areturn

  public boolean apply(java.lang.Character);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #347                // Method java/lang/Character.charValue:()C
       5: invokevirtual #236                // Method matches:(C)Z
       8: ireturn

  public boolean apply(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #343                // class java/lang/Character
       5: invokevirtual #350                // Method apply:(Ljava/lang/Character;)Z
       8: ireturn

  public java.lang.String collapseFrom(java.lang.CharSequence, char);
    Code:
       0: aload_1
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: istore        6
       8: iconst_0
       9: istore        4
      11: iload         4
      13: iload         6
      15: if_icmpge     132
      18: aload_1
      19: iload         4
      21: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      26: istore_3
      27: iload         4
      29: istore        5
      31: aload_0
      32: iload_3
      33: invokevirtual #236                // Method matches:(C)Z
      36: ifeq          123
      39: iload_3
      40: iload_2
      41: if_icmpne     79
      44: iload         4
      46: iload         6
      48: iconst_1
      49: isub
      50: if_icmpeq     70
      53: aload_0
      54: aload_1
      55: iload         4
      57: iconst_1
      58: iadd
      59: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      64: invokevirtual #236                // Method matches:(C)Z
      67: ifne          79
      70: iload         4
      72: iconst_1
      73: iadd
      74: istore        5
      76: goto          123
      79: new           #238                // class java/lang/StringBuilder
      82: dup
      83: iload         6
      85: invokespecial #355                // Method java/lang/StringBuilder."<init>":(I)V
      88: astore        7
      90: aload         7
      92: aload_1
      93: iconst_0
      94: iload         4
      96: invokevirtual #358                // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
      99: pop
     100: aload         7
     102: iload_2
     103: invokevirtual #242                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     106: pop
     107: aload_0
     108: aload_1
     109: iload         4
     111: iconst_1
     112: iadd
     113: iload         6
     115: iload_2
     116: aload         7
     118: iconst_1
     119: invokespecial #360                // Method finishCollapseFrom:(Ljava/lang/CharSequence;IICLjava/lang/StringBuilder;Z)Ljava/lang/String;
     122: areturn
     123: iload         5
     125: iconst_1
     126: iadd
     127: istore        4
     129: goto          11
     132: aload_1
     133: invokeinterface #361,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
     138: areturn

  public int countIn(java.lang.CharSequence);
    Code:
       0: iconst_0
       1: istore_2
       2: iconst_0
       3: istore_3
       4: iload_2
       5: aload_1
       6: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
      11: if_icmpge     46
      14: iload_3
      15: istore        4
      17: aload_0
      18: aload_1
      19: iload_2
      20: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      25: invokevirtual #236                // Method matches:(C)Z
      28: ifeq          36
      31: iload_3
      32: iconst_1
      33: iadd
      34: istore        4
      36: iload_2
      37: iconst_1
      38: iadd
      39: istore_2
      40: iload         4
      42: istore_3
      43: goto          4
      46: iload_3
      47: ireturn

  public int indexIn(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_0
       3: invokevirtual #367                // Method indexIn:(Ljava/lang/CharSequence;I)I
       6: ireturn

  public int indexIn(java.lang.CharSequence, int);
    Code:
       0: aload_1
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: istore_3
       7: iload_2
       8: iload_3
       9: invokestatic  #373                // Method com/google/common/base/Preconditions.checkPositionIndex:(II)I
      12: pop
      13: iload_2
      14: iload_3
      15: if_icmpge     41
      18: aload_0
      19: aload_1
      20: iload_2
      21: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      26: invokevirtual #236                // Method matches:(C)Z
      29: ifeq          34
      32: iload_2
      33: ireturn
      34: iload_2
      35: iconst_1
      36: iadd
      37: istore_2
      38: goto          13
      41: iconst_m1
      42: ireturn

  public int lastIndexIn(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: iconst_1
       7: isub
       8: istore_2
       9: iload_2
      10: iflt          36
      13: aload_0
      14: aload_1
      15: iload_2
      16: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      21: invokevirtual #236                // Method matches:(C)Z
      24: ifeq          29
      27: iload_2
      28: ireturn
      29: iload_2
      30: iconst_1
      31: isub
      32: istore_2
      33: goto          9
      36: iconst_m1
      37: ireturn

  public abstract boolean matches(char);

  public boolean matchesAllOf(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: iconst_1
       7: isub
       8: istore_2
       9: iload_2
      10: iflt          36
      13: aload_0
      14: aload_1
      15: iload_2
      16: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      21: invokevirtual #236                // Method matches:(C)Z
      24: ifne          29
      27: iconst_0
      28: ireturn
      29: iload_2
      30: iconst_1
      31: isub
      32: istore_2
      33: goto          9
      36: iconst_1
      37: ireturn

  public boolean matchesAnyOf(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #380                // Method matchesNoneOf:(Ljava/lang/CharSequence;)Z
       5: iconst_1
       6: ixor
       7: ireturn

  public boolean matchesNoneOf(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #382                // Method indexIn:(Ljava/lang/CharSequence;)I
       5: iconst_m1
       6: if_icmpne     11
       9: iconst_1
      10: ireturn
      11: iconst_0
      12: ireturn

  public com.google.common.base.CharMatcher negate();
    Code:
       0: new           #74                 // class com/google/common/base/CharMatcher$Negated
       3: dup
       4: aload_0
       5: invokespecial #385                // Method com/google/common/base/CharMatcher$Negated."<init>":(Lcom/google/common/base/CharMatcher;)V
       8: areturn

  public com.google.common.base.CharMatcher or(com.google.common.base.CharMatcher);
    Code:
       0: new           #83                 // class com/google/common/base/CharMatcher$Or
       3: dup
       4: aload_0
       5: aload_1
       6: invokespecial #387                // Method com/google/common/base/CharMatcher$Or."<init>":(Lcom/google/common/base/CharMatcher;Lcom/google/common/base/CharMatcher;)V
       9: areturn

  public com.google.common.base.CharMatcher precomputed();
    Code:
       0: aload_0
       1: invokestatic  #393                // Method com/google/common/base/Platform.precomputeCharMatcher:(Lcom/google/common/base/CharMatcher;)Lcom/google/common/base/CharMatcher;
       4: areturn

  com.google.common.base.CharMatcher precomputedInternal();
    Code:
       0: new           #300                // class java/util/BitSet
       3: dup
       4: invokespecial #395                // Method java/util/BitSet."<init>":()V
       7: astore_3
       8: aload_0
       9: aload_3
      10: invokevirtual #399                // Method setBits:(Ljava/util/BitSet;)V
      13: aload_3
      14: invokevirtual #402                // Method java/util/BitSet.cardinality:()I
      17: istore_1
      18: iload_1
      19: iconst_2
      20: imul
      21: ldc           #102                // int 65536
      23: if_icmpgt     36
      26: iload_1
      27: aload_3
      28: aload_0
      29: invokevirtual #403                // Method toString:()Ljava/lang/String;
      32: invokestatic  #405                // Method precomputedPositive:(ILjava/util/BitSet;Ljava/lang/String;)Lcom/google/common/base/CharMatcher;
      35: areturn
      36: aload_3
      37: iconst_0
      38: ldc           #102                // int 65536
      40: invokevirtual #409                // Method java/util/BitSet.flip:(II)V
      43: aload_0
      44: invokevirtual #403                // Method toString:()Ljava/lang/String;
      47: astore        4
      49: aload         4
      51: ldc_w         #411                // String .negate()
      54: invokevirtual #415                // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
      57: ifeq          82
      60: aload         4
      62: iconst_0
      63: aload         4
      65: invokevirtual #416                // Method java/lang/String.length:()I
      68: ldc_w         #411                // String .negate()
      71: invokevirtual #416                // Method java/lang/String.length:()I
      74: isub
      75: invokevirtual #420                // Method java/lang/String.substring:(II)Ljava/lang/String;
      78: astore_2
      79: goto          110
      82: new           #238                // class java/lang/StringBuilder
      85: dup
      86: invokespecial #421                // Method java/lang/StringBuilder."<init>":()V
      89: astore_2
      90: aload_2
      91: aload         4
      93: invokevirtual #424                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      96: pop
      97: aload_2
      98: ldc_w         #411                // String .negate()
     101: invokevirtual #424                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     104: pop
     105: aload_2
     106: invokevirtual #246                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     109: astore_2
     110: new           #9                  // class com/google/common/base/CharMatcher$1
     113: dup
     114: aload_0
     115: ldc           #102                // int 65536
     117: iload_1
     118: isub
     119: aload_3
     120: aload_2
     121: invokestatic  #405                // Method precomputedPositive:(ILjava/util/BitSet;Ljava/lang/String;)Lcom/google/common/base/CharMatcher;
     124: aload         4
     126: invokespecial #427                // Method com/google/common/base/CharMatcher$1."<init>":(Lcom/google/common/base/CharMatcher;Lcom/google/common/base/CharMatcher;Ljava/lang/String;)V
     129: areturn

  public java.lang.String removeFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #361,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
       6: astore_1
       7: aload_0
       8: aload_1
       9: invokevirtual #382                // Method indexIn:(Ljava/lang/CharSequence;)I
      12: istore_2
      13: iload_2
      14: iconst_m1
      15: if_icmpne     20
      18: aload_1
      19: areturn
      20: aload_1
      21: invokevirtual #433                // Method java/lang/String.toCharArray:()[C
      24: astore_1
      25: iconst_1
      26: istore_3
      27: iload_2
      28: iconst_1
      29: iadd
      30: istore_2
      31: iload_2
      32: aload_1
      33: arraylength
      34: if_icmpne     50
      37: new           #323                // class java/lang/String
      40: dup
      41: aload_1
      42: iconst_0
      43: iload_2
      44: iload_3
      45: isub
      46: invokespecial #436                // Method java/lang/String."<init>":([CII)V
      49: areturn
      50: aload_0
      51: aload_1
      52: iload_2
      53: caload
      54: invokevirtual #236                // Method matches:(C)Z
      57: ifeq          67
      60: iload_3
      61: iconst_1
      62: iadd
      63: istore_3
      64: goto          27
      67: aload_1
      68: iload_2
      69: iload_3
      70: isub
      71: aload_1
      72: iload_2
      73: caload
      74: castore
      75: iload_2
      76: iconst_1
      77: iadd
      78: istore_2
      79: goto          31

  public java.lang.String replaceFrom(java.lang.CharSequence, char);
    Code:
       0: aload_1
       1: invokeinterface #361,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
       6: astore_1
       7: aload_0
       8: aload_1
       9: invokevirtual #382                // Method indexIn:(Ljava/lang/CharSequence;)I
      12: istore_3
      13: iload_3
      14: iconst_m1
      15: if_icmpne     20
      18: aload_1
      19: areturn
      20: aload_1
      21: invokevirtual #433                // Method java/lang/String.toCharArray:()[C
      24: astore_1
      25: aload_1
      26: iload_3
      27: iload_2
      28: castore
      29: iload_3
      30: iconst_1
      31: iadd
      32: istore        4
      34: iload         4
      36: aload_1
      37: arraylength
      38: if_icmpge     66
      41: iload         4
      43: istore_3
      44: aload_0
      45: aload_1
      46: iload         4
      48: caload
      49: invokevirtual #236                // Method matches:(C)Z
      52: ifeq          29
      55: aload_1
      56: iload         4
      58: iload_2
      59: castore
      60: iload         4
      62: istore_3
      63: goto          29
      66: new           #323                // class java/lang/String
      69: dup
      70: aload_1
      71: invokespecial #440                // Method java/lang/String."<init>":([C)V
      74: areturn

  public java.lang.String replaceFrom(java.lang.CharSequence, java.lang.CharSequence);
    Code:
       0: aload_2
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: istore        4
       8: iload         4
      10: ifne          19
      13: aload_0
      14: aload_1
      15: invokevirtual #443                // Method removeFrom:(Ljava/lang/CharSequence;)Ljava/lang/String;
      18: areturn
      19: iconst_0
      20: istore_3
      21: iload         4
      23: iconst_1
      24: if_icmpne     40
      27: aload_0
      28: aload_1
      29: aload_2
      30: iconst_0
      31: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      36: invokevirtual #445                // Method replaceFrom:(Ljava/lang/CharSequence;C)Ljava/lang/String;
      39: areturn
      40: aload_1
      41: invokeinterface #361,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      46: astore_1
      47: aload_0
      48: aload_1
      49: invokevirtual #382                // Method indexIn:(Ljava/lang/CharSequence;)I
      52: istore        4
      54: iload         4
      56: iconst_m1
      57: if_icmpne     62
      60: aload_1
      61: areturn
      62: aload_1
      63: invokevirtual #416                // Method java/lang/String.length:()I
      66: istore        7
      68: new           #238                // class java/lang/StringBuilder
      71: dup
      72: iload         7
      74: iconst_3
      75: imul
      76: iconst_2
      77: idiv
      78: bipush        16
      80: iadd
      81: invokespecial #355                // Method java/lang/StringBuilder."<init>":(I)V
      84: astore        8
      86: aload         8
      88: aload_1
      89: iload_3
      90: iload         4
      92: invokevirtual #358                // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
      95: pop
      96: aload         8
      98: aload_2
      99: invokevirtual #448                // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
     102: pop
     103: iload         4
     105: iconst_1
     106: iadd
     107: istore        5
     109: aload_0
     110: aload_1
     111: iload         5
     113: invokevirtual #367                // Method indexIn:(Ljava/lang/CharSequence;I)I
     116: istore        6
     118: iload         6
     120: istore        4
     122: iload         5
     124: istore_3
     125: iload         6
     127: iconst_m1
     128: if_icmpne     86
     131: aload         8
     133: aload_1
     134: iload         5
     136: iload         7
     138: invokevirtual #358                // Method java/lang/StringBuilder.append:(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
     141: pop
     142: aload         8
     144: invokevirtual #246                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     147: areturn

  public java.lang.String retainFrom(java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokevirtual #296                // Method negate:()Lcom/google/common/base/CharMatcher;
       4: aload_1
       5: invokevirtual #443                // Method removeFrom:(Ljava/lang/CharSequence;)Ljava/lang/String;
       8: areturn

  void setBits(java.util.BitSet);
    Code:
       0: ldc_w         #450                // int 65535
       3: istore_2
       4: iload_2
       5: iflt          29
       8: aload_0
       9: iload_2
      10: i2c
      11: invokevirtual #236                // Method matches:(C)Z
      14: ifeq          22
      17: aload_1
      18: iload_2
      19: invokevirtual #453                // Method java/util/BitSet.set:(I)V
      22: iload_2
      23: iconst_1
      24: isub
      25: istore_2
      26: goto          4
      29: return

  public java.lang.String toString();
    Code:
       0: aload_0
       1: invokespecial #454                // Method java/lang/Object.toString:()Ljava/lang/String;
       4: areturn

  public java.lang.String trimAndCollapseFrom(java.lang.CharSequence, char);
    Code:
       0: aload_1
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: istore        4
       8: iload         4
      10: iconst_1
      11: isub
      12: istore        5
      14: iconst_0
      15: istore_3
      16: iload_3
      17: iload         4
      19: if_icmpge     43
      22: aload_0
      23: aload_1
      24: iload_3
      25: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      30: invokevirtual #236                // Method matches:(C)Z
      33: ifeq          43
      36: iload_3
      37: iconst_1
      38: iadd
      39: istore_3
      40: goto          16
      43: iload         5
      45: istore        4
      47: iload         4
      49: iload_3
      50: if_icmple     77
      53: aload_0
      54: aload_1
      55: iload         4
      57: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      62: invokevirtual #236                // Method matches:(C)Z
      65: ifeq          77
      68: iload         4
      70: iconst_1
      71: isub
      72: istore        4
      74: goto          47
      77: iload_3
      78: ifne          95
      81: iload         4
      83: iload         5
      85: if_icmpne     95
      88: aload_0
      89: aload_1
      90: iload_2
      91: invokevirtual #457                // Method collapseFrom:(Ljava/lang/CharSequence;C)Ljava/lang/String;
      94: areturn
      95: iload         4
      97: iconst_1
      98: iadd
      99: istore        4
     101: aload_0
     102: aload_1
     103: iload_3
     104: iload         4
     106: iload_2
     107: new           #238                // class java/lang/StringBuilder
     110: dup
     111: iload         4
     113: iload_3
     114: isub
     115: invokespecial #355                // Method java/lang/StringBuilder."<init>":(I)V
     118: iconst_0
     119: invokespecial #360                // Method finishCollapseFrom:(Ljava/lang/CharSequence;IICLjava/lang/StringBuilder;Z)Ljava/lang/String;
     122: areturn

  public java.lang.String trimFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: istore_3
       7: iconst_0
       8: istore_2
       9: iload_2
      10: iload_3
      11: if_icmpge     38
      14: aload_0
      15: aload_1
      16: iload_2
      17: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      22: invokevirtual #236                // Method matches:(C)Z
      25: ifne          31
      28: goto          38
      31: iload_2
      32: iconst_1
      33: iadd
      34: istore_2
      35: goto          9
      38: iload_3
      39: iconst_1
      40: isub
      41: istore_3
      42: iload_3
      43: iload_2
      44: if_icmple     71
      47: aload_0
      48: aload_1
      49: iload_3
      50: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      55: invokevirtual #236                // Method matches:(C)Z
      58: ifne          64
      61: goto          71
      64: iload_3
      65: iconst_1
      66: isub
      67: istore_3
      68: goto          42
      71: aload_1
      72: iload_2
      73: iload_3
      74: iconst_1
      75: iadd
      76: invokeinterface #462,  3          // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
      81: invokeinterface #361,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      86: areturn

  public java.lang.String trimLeadingFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: istore_3
       7: iconst_0
       8: istore_2
       9: iload_2
      10: iload_3
      11: if_icmpge     49
      14: aload_0
      15: aload_1
      16: iload_2
      17: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      22: invokevirtual #236                // Method matches:(C)Z
      25: ifne          42
      28: aload_1
      29: iload_2
      30: iload_3
      31: invokeinterface #462,  3          // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
      36: invokeinterface #361,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      41: areturn
      42: iload_2
      43: iconst_1
      44: iadd
      45: istore_2
      46: goto          9
      49: ldc_w         #465                // String
      52: areturn

  public java.lang.String trimTrailingFrom(java.lang.CharSequence);
    Code:
       0: aload_1
       1: invokeinterface #206,  1          // InterfaceMethod java/lang/CharSequence.length:()I
       6: iconst_1
       7: isub
       8: istore_2
       9: iload_2
      10: iflt          50
      13: aload_0
      14: aload_1
      15: iload_2
      16: invokeinterface #213,  2          // InterfaceMethod java/lang/CharSequence.charAt:(I)C
      21: invokevirtual #236                // Method matches:(C)Z
      24: ifne          43
      27: aload_1
      28: iconst_0
      29: iload_2
      30: iconst_1
      31: iadd
      32: invokeinterface #462,  3          // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
      37: invokeinterface #361,  1          // InterfaceMethod java/lang/CharSequence.toString:()Ljava/lang/String;
      42: areturn
      43: iload_2
      44: iconst_1
      45: isub
      46: istore_2
      47: goto          9
      50: ldc_w         #465                // String
      53: areturn
}
