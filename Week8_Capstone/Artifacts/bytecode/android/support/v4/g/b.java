public final class android.support.v4.g.b<E> implements java.util.Collection<E>, java.util.Set<E> {
  static {};
    Code:
       0: iconst_0
       1: newarray       int
       3: putstatic     #30                 // Field a:[I
       6: iconst_0
       7: anewarray     #5                  // class java/lang/Object
      10: putstatic     #32                 // Field b:[Ljava/lang/Object;
      13: return

  public android.support.v4.g.b();
    Code:
       0: aload_0
       1: iconst_0
       2: invokespecial #37                 // Method "<init>":(I)V
       5: return

  public android.support.v4.g.b(int);
    Code:
       0: aload_0
       1: invokespecial #39                 // Method java/lang/Object."<init>":()V
       4: iload_1
       5: ifne          25
       8: aload_0
       9: getstatic     #30                 // Field a:[I
      12: putfield      #41                 // Field g:[I
      15: aload_0
      16: getstatic     #32                 // Field b:[Ljava/lang/Object;
      19: putfield      #43                 // Field h:[Ljava/lang/Object;
      22: goto          30
      25: aload_0
      26: iload_1
      27: invokespecial #45                 // Method d:(I)V
      30: aload_0
      31: iconst_0
      32: putfield      #47                 // Field i:I
      35: return

  public android.support.v4.g.b(java.util.Collection<E>);
    Code:
       0: aload_0
       1: invokespecial #49                 // Method "<init>":()V
       4: aload_1
       5: ifnull        14
       8: aload_0
       9: aload_1
      10: invokevirtual #53                 // Method addAll:(Ljava/util/Collection;)Z
      13: pop
      14: return

  static int a(android.support.v4.g.b);
    Code:
       0: aload_0
       1: getfield      #47                 // Field i:I
       4: ireturn

  static java.lang.Object[] b(android.support.v4.g.b);
    Code:
       0: aload_0
       1: getfield      #43                 // Field h:[Ljava/lang/Object;
       4: areturn

  public int a(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     9
       4: aload_0
       5: invokespecial #89                 // Method a:()I
       8: ireturn
       9: aload_0
      10: aload_1
      11: aload_1
      12: invokevirtual #92                 // Method java/lang/Object.hashCode:()I
      15: invokespecial #94                 // Method a:(Ljava/lang/Object;I)I
      18: ireturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field g:[I
       4: arraylength
       5: iload_1
       6: if_icmpge     68
       9: aload_0
      10: getfield      #41                 // Field g:[I
      13: astore_2
      14: aload_0
      15: getfield      #43                 // Field h:[Ljava/lang/Object;
      18: astore_3
      19: aload_0
      20: iload_1
      21: invokespecial #45                 // Method d:(I)V
      24: aload_0
      25: getfield      #47                 // Field i:I
      28: ifle          59
      31: aload_2
      32: iconst_0
      33: aload_0
      34: getfield      #41                 // Field g:[I
      37: iconst_0
      38: aload_0
      39: getfield      #47                 // Field i:I
      42: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      45: aload_3
      46: iconst_0
      47: aload_0
      48: getfield      #43                 // Field h:[Ljava/lang/Object;
      51: iconst_0
      52: aload_0
      53: getfield      #47                 // Field i:I
      56: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      59: aload_2
      60: aload_3
      61: aload_0
      62: getfield      #47                 // Field i:I
      65: invokestatic  #102                // Method a:([I[Ljava/lang/Object;I)V
      68: return

  public boolean add(E);
    Code:
       0: aload_1
       1: ifnonnull     14
       4: aload_0
       5: invokespecial #89                 // Method a:()I
       8: istore_2
       9: iconst_0
      10: istore_3
      11: goto          26
      14: aload_1
      15: invokevirtual #92                 // Method java/lang/Object.hashCode:()I
      18: istore_3
      19: aload_0
      20: aload_1
      21: iload_3
      22: invokespecial #94                 // Method a:(Ljava/lang/Object;I)I
      25: istore_2
      26: iload_2
      27: iflt          32
      30: iconst_0
      31: ireturn
      32: iload_2
      33: iconst_m1
      34: ixor
      35: istore        4
      37: aload_0
      38: getfield      #47                 // Field i:I
      41: aload_0
      42: getfield      #41                 // Field g:[I
      45: arraylength
      46: if_icmplt     156
      49: aload_0
      50: getfield      #47                 // Field i:I
      53: istore        5
      55: iconst_4
      56: istore_2
      57: iload         5
      59: bipush        8
      61: if_icmplt     81
      64: aload_0
      65: getfield      #47                 // Field i:I
      68: istore_2
      69: aload_0
      70: getfield      #47                 // Field i:I
      73: iconst_1
      74: ishr
      75: iload_2
      76: iadd
      77: istore_2
      78: goto          92
      81: aload_0
      82: getfield      #47                 // Field i:I
      85: iconst_4
      86: if_icmplt     92
      89: bipush        8
      91: istore_2
      92: aload_0
      93: getfield      #41                 // Field g:[I
      96: astore        6
      98: aload_0
      99: getfield      #43                 // Field h:[Ljava/lang/Object;
     102: astore        7
     104: aload_0
     105: iload_2
     106: invokespecial #45                 // Method d:(I)V
     109: aload_0
     110: getfield      #41                 // Field g:[I
     113: arraylength
     114: ifle          145
     117: aload         6
     119: iconst_0
     120: aload_0
     121: getfield      #41                 // Field g:[I
     124: iconst_0
     125: aload         6
     127: arraylength
     128: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     131: aload         7
     133: iconst_0
     134: aload_0
     135: getfield      #43                 // Field h:[Ljava/lang/Object;
     138: iconst_0
     139: aload         7
     141: arraylength
     142: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     145: aload         6
     147: aload         7
     149: aload_0
     150: getfield      #47                 // Field i:I
     153: invokestatic  #102                // Method a:([I[Ljava/lang/Object;I)V
     156: iload         4
     158: aload_0
     159: getfield      #47                 // Field i:I
     162: if_icmpge     220
     165: aload_0
     166: getfield      #41                 // Field g:[I
     169: astore        6
     171: aload_0
     172: getfield      #41                 // Field g:[I
     175: astore        7
     177: iload         4
     179: iconst_1
     180: iadd
     181: istore_2
     182: aload         6
     184: iload         4
     186: aload         7
     188: iload_2
     189: aload_0
     190: getfield      #47                 // Field i:I
     193: iload         4
     195: isub
     196: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     199: aload_0
     200: getfield      #43                 // Field h:[Ljava/lang/Object;
     203: iload         4
     205: aload_0
     206: getfield      #43                 // Field h:[Ljava/lang/Object;
     209: iload_2
     210: aload_0
     211: getfield      #47                 // Field i:I
     214: iload         4
     216: isub
     217: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     220: aload_0
     221: getfield      #41                 // Field g:[I
     224: iload         4
     226: iload_3
     227: iastore
     228: aload_0
     229: getfield      #43                 // Field h:[Ljava/lang/Object;
     232: iload         4
     234: aload_1
     235: aastore
     236: aload_0
     237: aload_0
     238: getfield      #47                 // Field i:I
     241: iconst_1
     242: iadd
     243: putfield      #47                 // Field i:I
     246: iconst_1
     247: ireturn

  public boolean addAll(java.util.Collection<? extends E>);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #47                 // Field i:I
       5: aload_1
       6: invokeinterface #107,  1          // InterfaceMethod java/util/Collection.size:()I
      11: iadd
      12: invokevirtual #109                // Method a:(I)V
      15: aload_1
      16: invokeinterface #113,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      21: astore_1
      22: iconst_0
      23: istore_2
      24: aload_1
      25: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      30: ifeq          49
      33: iload_2
      34: aload_0
      35: aload_1
      36: invokeinterface #123,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      41: invokevirtual #125                // Method add:(Ljava/lang/Object;)Z
      44: ior
      45: istore_2
      46: goto          24
      49: iload_2
      50: ireturn

  public E b(int);
    Code:
       0: aload_0
       1: getfield      #43                 // Field h:[Ljava/lang/Object;
       4: iload_1
       5: aaload
       6: areturn

  public E c(int);
    Code:
       0: aload_0
       1: getfield      #43                 // Field h:[Ljava/lang/Object;
       4: iload_1
       5: aaload
       6: astore        4
       8: aload_0
       9: getfield      #47                 // Field i:I
      12: iconst_1
      13: if_icmpgt     53
      16: aload_0
      17: getfield      #41                 // Field g:[I
      20: aload_0
      21: getfield      #43                 // Field h:[Ljava/lang/Object;
      24: aload_0
      25: getfield      #47                 // Field i:I
      28: invokestatic  #102                // Method a:([I[Ljava/lang/Object;I)V
      31: aload_0
      32: getstatic     #30                 // Field a:[I
      35: putfield      #41                 // Field g:[I
      38: aload_0
      39: getstatic     #32                 // Field b:[Ljava/lang/Object;
      42: putfield      #43                 // Field h:[Ljava/lang/Object;
      45: aload_0
      46: iconst_0
      47: putfield      #47                 // Field i:I
      50: aload         4
      52: areturn
      53: aload_0
      54: getfield      #41                 // Field g:[I
      57: arraylength
      58: istore_3
      59: bipush        8
      61: istore_2
      62: iload_3
      63: bipush        8
      65: if_icmple     209
      68: aload_0
      69: getfield      #47                 // Field i:I
      72: aload_0
      73: getfield      #41                 // Field g:[I
      76: arraylength
      77: iconst_3
      78: idiv
      79: if_icmpge     209
      82: aload_0
      83: getfield      #47                 // Field i:I
      86: bipush        8
      88: if_icmple     105
      91: aload_0
      92: getfield      #47                 // Field i:I
      95: istore_2
      96: aload_0
      97: getfield      #47                 // Field i:I
     100: iconst_1
     101: ishr
     102: iload_2
     103: iadd
     104: istore_2
     105: aload_0
     106: getfield      #41                 // Field g:[I
     109: astore        5
     111: aload_0
     112: getfield      #43                 // Field h:[Ljava/lang/Object;
     115: astore        6
     117: aload_0
     118: iload_2
     119: invokespecial #45                 // Method d:(I)V
     122: aload_0
     123: aload_0
     124: getfield      #47                 // Field i:I
     127: iconst_1
     128: isub
     129: putfield      #47                 // Field i:I
     132: iload_1
     133: ifle          160
     136: aload         5
     138: iconst_0
     139: aload_0
     140: getfield      #41                 // Field g:[I
     143: iconst_0
     144: iload_1
     145: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     148: aload         6
     150: iconst_0
     151: aload_0
     152: getfield      #43                 // Field h:[Ljava/lang/Object;
     155: iconst_0
     156: iload_1
     157: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     160: iload_1
     161: aload_0
     162: getfield      #47                 // Field i:I
     165: if_icmpge     283
     168: iload_1
     169: iconst_1
     170: iadd
     171: istore_2
     172: aload         5
     174: iload_2
     175: aload_0
     176: getfield      #41                 // Field g:[I
     179: iload_1
     180: aload_0
     181: getfield      #47                 // Field i:I
     184: iload_1
     185: isub
     186: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     189: aload         6
     191: iload_2
     192: aload_0
     193: getfield      #43                 // Field h:[Ljava/lang/Object;
     196: iload_1
     197: aload_0
     198: getfield      #47                 // Field i:I
     201: iload_1
     202: isub
     203: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     206: aload         4
     208: areturn
     209: aload_0
     210: aload_0
     211: getfield      #47                 // Field i:I
     214: iconst_1
     215: isub
     216: putfield      #47                 // Field i:I
     219: iload_1
     220: aload_0
     221: getfield      #47                 // Field i:I
     224: if_icmpge     273
     227: aload_0
     228: getfield      #41                 // Field g:[I
     231: astore        5
     233: iload_1
     234: iconst_1
     235: iadd
     236: istore_2
     237: aload         5
     239: iload_2
     240: aload_0
     241: getfield      #41                 // Field g:[I
     244: iload_1
     245: aload_0
     246: getfield      #47                 // Field i:I
     249: iload_1
     250: isub
     251: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     254: aload_0
     255: getfield      #43                 // Field h:[Ljava/lang/Object;
     258: iload_2
     259: aload_0
     260: getfield      #43                 // Field h:[Ljava/lang/Object;
     263: iload_1
     264: aload_0
     265: getfield      #47                 // Field i:I
     268: iload_1
     269: isub
     270: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
     273: aload_0
     274: getfield      #43                 // Field h:[Ljava/lang/Object;
     277: aload_0
     278: getfield      #47                 // Field i:I
     281: aconst_null
     282: aastore
     283: aload         4
     285: areturn

  public void clear();
    Code:
       0: aload_0
       1: getfield      #47                 // Field i:I
       4: ifeq          41
       7: aload_0
       8: getfield      #41                 // Field g:[I
      11: aload_0
      12: getfield      #43                 // Field h:[Ljava/lang/Object;
      15: aload_0
      16: getfield      #47                 // Field i:I
      19: invokestatic  #102                // Method a:([I[Ljava/lang/Object;I)V
      22: aload_0
      23: getstatic     #30                 // Field a:[I
      26: putfield      #41                 // Field g:[I
      29: aload_0
      30: getstatic     #32                 // Field b:[Ljava/lang/Object;
      33: putfield      #43                 // Field h:[Ljava/lang/Object;
      36: aload_0
      37: iconst_0
      38: putfield      #47                 // Field i:I
      41: return

  public boolean contains(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #132                // Method a:(Ljava/lang/Object;)I
       5: iflt          10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public boolean containsAll(java.util.Collection<?>);
    Code:
       0: aload_1
       1: invokeinterface #113,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       6: astore_1
       7: aload_1
       8: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      13: ifeq          31
      16: aload_0
      17: aload_1
      18: invokeinterface #123,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      23: invokevirtual #135                // Method contains:(Ljava/lang/Object;)Z
      26: ifne          7
      29: iconst_0
      30: ireturn
      31: iconst_1
      32: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: instanceof    #9                  // class java/util/Set
      11: ifeq          71
      14: aload_1
      15: checkcast     #9                  // class java/util/Set
      18: astore_1
      19: aload_0
      20: invokevirtual #141                // Method size:()I
      23: aload_1
      24: invokeinterface #142,  1          // InterfaceMethod java/util/Set.size:()I
      29: if_icmpeq     34
      32: iconst_0
      33: ireturn
      34: iconst_0
      35: istore_2
      36: iload_2
      37: aload_0
      38: getfield      #47                 // Field i:I
      41: if_icmpge     69
      44: aload_1
      45: aload_0
      46: iload_2
      47: invokevirtual #144                // Method b:(I)Ljava/lang/Object;
      50: invokeinterface #145,  2          // InterfaceMethod java/util/Set.contains:(Ljava/lang/Object;)Z
      55: istore_3
      56: iload_3
      57: ifne          62
      60: iconst_0
      61: ireturn
      62: iload_2
      63: iconst_1
      64: iadd
      65: istore_2
      66: goto          36
      69: iconst_1
      70: ireturn
      71: iconst_0
      72: ireturn
      73: astore_1
      74: iconst_0
      75: ireturn
    Exception table:
       from    to  target type
          36    56    73   Class java/lang/NullPointerException
          36    56    73   Class java/lang/ClassCastException

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #41                 // Field g:[I
       4: astore        4
       6: aload_0
       7: getfield      #47                 // Field i:I
      10: istore_3
      11: iconst_0
      12: istore_1
      13: iconst_0
      14: istore_2
      15: iload_1
      16: iload_3
      17: if_icmpge     34
      20: iload_2
      21: aload         4
      23: iload_1
      24: iaload
      25: iadd
      26: istore_2
      27: iload_1
      28: iconst_1
      29: iadd
      30: istore_1
      31: goto          15
      34: iload_2
      35: ireturn

  public boolean isEmpty();
    Code:
       0: aload_0
       1: getfield      #47                 // Field i:I
       4: ifgt          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public java.util.Iterator<E> iterator();
    Code:
       0: aload_0
       1: invokespecial #148                // Method b:()Landroid/support/v4/g/h;
       4: invokevirtual #153                // Method android/support/v4/g/h.e:()Ljava/util/Set;
       7: invokeinterface #154,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      12: areturn

  public boolean remove(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #132                // Method a:(Ljava/lang/Object;)I
       5: istore_2
       6: iload_2
       7: iflt          18
      10: aload_0
      11: iload_2
      12: invokevirtual #158                // Method c:(I)Ljava/lang/Object;
      15: pop
      16: iconst_1
      17: ireturn
      18: iconst_0
      19: ireturn

  public boolean removeAll(java.util.Collection<?>);
    Code:
       0: aload_1
       1: invokeinterface #113,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
       6: astore_1
       7: iconst_0
       8: istore_2
       9: aload_1
      10: invokeinterface #119,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      15: ifeq          34
      18: iload_2
      19: aload_0
      20: aload_1
      21: invokeinterface #123,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      26: invokevirtual #161                // Method remove:(Ljava/lang/Object;)Z
      29: ior
      30: istore_2
      31: goto          9
      34: iload_2
      35: ireturn

  public boolean retainAll(java.util.Collection<?>);
    Code:
       0: aload_0
       1: getfield      #47                 // Field i:I
       4: iconst_1
       5: isub
       6: istore_2
       7: iconst_0
       8: istore_3
       9: iload_2
      10: iflt          43
      13: aload_1
      14: aload_0
      15: getfield      #43                 // Field h:[Ljava/lang/Object;
      18: iload_2
      19: aaload
      20: invokeinterface #163,  2          // InterfaceMethod java/util/Collection.contains:(Ljava/lang/Object;)Z
      25: ifne          36
      28: aload_0
      29: iload_2
      30: invokevirtual #158                // Method c:(I)Ljava/lang/Object;
      33: pop
      34: iconst_1
      35: istore_3
      36: iload_2
      37: iconst_1
      38: isub
      39: istore_2
      40: goto          9
      43: iload_3
      44: ireturn

  public int size();
    Code:
       0: aload_0
       1: getfield      #47                 // Field i:I
       4: ireturn

  public java.lang.Object[] toArray();
    Code:
       0: aload_0
       1: getfield      #47                 // Field i:I
       4: anewarray     #5                  // class java/lang/Object
       7: astore_1
       8: aload_0
       9: getfield      #43                 // Field h:[Ljava/lang/Object;
      12: iconst_0
      13: aload_1
      14: iconst_0
      15: aload_0
      16: getfield      #47                 // Field i:I
      19: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      22: aload_1
      23: areturn

  public <T> T[] toArray(T[]);
    Code:
       0: aload_1
       1: astore_2
       2: aload_1
       3: arraylength
       4: aload_0
       5: getfield      #47                 // Field i:I
       8: if_icmpge     29
      11: aload_1
      12: invokevirtual #170                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      15: invokevirtual #175                // Method java/lang/Class.getComponentType:()Ljava/lang/Class;
      18: aload_0
      19: getfield      #47                 // Field i:I
      22: invokestatic  #181                // Method java/lang/reflect/Array.newInstance:(Ljava/lang/Class;I)Ljava/lang/Object;
      25: checkcast     #85                 // class "[Ljava/lang/Object;"
      28: astore_2
      29: aload_0
      30: getfield      #43                 // Field h:[Ljava/lang/Object;
      33: iconst_0
      34: aload_2
      35: iconst_0
      36: aload_0
      37: getfield      #47                 // Field i:I
      40: invokestatic  #100                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      43: aload_2
      44: arraylength
      45: aload_0
      46: getfield      #47                 // Field i:I
      49: if_icmple     59
      52: aload_2
      53: aload_0
      54: getfield      #47                 // Field i:I
      57: aconst_null
      58: aastore
      59: aload_2
      60: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: invokevirtual #186                // Method isEmpty:()Z
       4: ifeq          10
       7: ldc           #188                // String {}
       9: areturn
      10: new           #190                // class java/lang/StringBuilder
      13: dup
      14: aload_0
      15: getfield      #47                 // Field i:I
      18: bipush        14
      20: imul
      21: invokespecial #191                // Method java/lang/StringBuilder."<init>":(I)V
      24: astore_2
      25: aload_2
      26: bipush        123
      28: invokevirtual #195                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      31: pop
      32: iconst_0
      33: istore_1
      34: iload_1
      35: aload_0
      36: getfield      #47                 // Field i:I
      39: if_icmpge     87
      42: iload_1
      43: ifle          53
      46: aload_2
      47: ldc           #197                // String ,
      49: invokevirtual #200                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload_0
      54: iload_1
      55: invokevirtual #144                // Method b:(I)Ljava/lang/Object;
      58: astore_3
      59: aload_3
      60: aload_0
      61: if_acmpeq     73
      64: aload_2
      65: aload_3
      66: invokevirtual #203                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      69: pop
      70: goto          80
      73: aload_2
      74: ldc           #205                // String (this Set)
      76: invokevirtual #200                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      79: pop
      80: iload_1
      81: iconst_1
      82: iadd
      83: istore_1
      84: goto          34
      87: aload_2
      88: bipush        125
      90: invokevirtual #195                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      93: pop
      94: aload_2
      95: invokevirtual #207                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      98: areturn
}
