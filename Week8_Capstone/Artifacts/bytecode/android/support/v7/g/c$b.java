public class android.support.v7.g.c$b {
  android.support.v7.g.c$b(android.support.v7.g.c$a, java.util.List<android.support.v7.g.c$f>, int[], int[], boolean);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_2
       6: putfield      #26                 // Field a:Ljava/util/List;
       9: aload_0
      10: aload_3
      11: putfield      #28                 // Field b:[I
      14: aload_0
      15: aload         4
      17: putfield      #30                 // Field c:[I
      20: aload_0
      21: getfield      #28                 // Field b:[I
      24: iconst_0
      25: invokestatic  #36                 // Method java/util/Arrays.fill:([II)V
      28: aload_0
      29: getfield      #30                 // Field c:[I
      32: iconst_0
      33: invokestatic  #36                 // Method java/util/Arrays.fill:([II)V
      36: aload_0
      37: aload_1
      38: putfield      #38                 // Field d:Landroid/support/v7/g/c$a;
      41: aload_0
      42: aload_1
      43: invokevirtual #43                 // Method android/support/v7/g/c$a.a:()I
      46: putfield      #45                 // Field e:I
      49: aload_0
      50: aload_1
      51: invokevirtual #47                 // Method android/support/v7/g/c$a.b:()I
      54: putfield      #49                 // Field f:I
      57: aload_0
      58: iload         5
      60: putfield      #51                 // Field g:Z
      63: aload_0
      64: invokespecial #53                 // Method a:()V
      67: aload_0
      68: invokespecial #55                 // Method b:()V
      71: return

  public void a(android.support.v7.g.d);
    Code:
       0: aload_1
       1: instanceof    #182                // class android/support/v7/g/b
       4: ifeq          15
       7: aload_1
       8: checkcast     #182                // class android/support/v7/g/b
      11: astore_1
      12: goto          24
      15: new           #182                // class android/support/v7/g/b
      18: dup
      19: aload_1
      20: invokespecial #184                // Method android/support/v7/g/b."<init>":(Landroid/support/v7/g/d;)V
      23: astore_1
      24: new           #186                // class java/util/ArrayList
      27: dup
      28: invokespecial #187                // Method java/util/ArrayList."<init>":()V
      31: astore        8
      33: aload_0
      34: getfield      #45                 // Field e:I
      37: istore_3
      38: aload_0
      39: getfield      #49                 // Field f:I
      42: istore        4
      44: aload_0
      45: getfield      #26                 // Field a:Ljava/util/List;
      48: invokeinterface #64,  1           // InterfaceMethod java/util/List.size:()I
      53: istore_2
      54: iload_2
      55: iconst_1
      56: isub
      57: istore_2
      58: iload_2
      59: iflt          236
      62: aload_0
      63: getfield      #26                 // Field a:Ljava/util/List;
      66: iload_2
      67: invokeinterface #68,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      72: checkcast     #86                 // class android/support/v7/g/c$f
      75: astore        9
      77: aload         9
      79: getfield      #93                 // Field android/support/v7/g/c$f.c:I
      82: istore        5
      84: aload         9
      86: getfield      #87                 // Field android/support/v7/g/c$f.a:I
      89: iload         5
      91: iadd
      92: istore        6
      94: aload         9
      96: getfield      #88                 // Field android/support/v7/g/c$f.b:I
      99: iload         5
     101: iadd
     102: istore        7
     104: iload         6
     106: iload_3
     107: if_icmpge     125
     110: aload_0
     111: aload         8
     113: aload_1
     114: iload         6
     116: iload_3
     117: iload         6
     119: isub
     120: iload         6
     122: invokespecial #189                // Method b:(Ljava/util/List;Landroid/support/v7/g/d;III)V
     125: iload         7
     127: iload         4
     129: if_icmpge     148
     132: aload_0
     133: aload         8
     135: aload_1
     136: iload         6
     138: iload         4
     140: iload         7
     142: isub
     143: iload         7
     145: invokespecial #191                // Method a:(Ljava/util/List;Landroid/support/v7/g/d;III)V
     148: iload         5
     150: iconst_1
     151: isub
     152: istore_3
     153: iload_3
     154: iflt          216
     157: aload_0
     158: getfield      #28                 // Field b:[I
     161: aload         9
     163: getfield      #87                 // Field android/support/v7/g/c$f.a:I
     166: iload_3
     167: iadd
     168: iaload
     169: bipush        31
     171: iand
     172: iconst_2
     173: if_icmpne     209
     176: aload_1
     177: aload         9
     179: getfield      #87                 // Field android/support/v7/g/c$f.a:I
     182: iload_3
     183: iadd
     184: iconst_1
     185: aload_0
     186: getfield      #38                 // Field d:Landroid/support/v7/g/c$a;
     189: aload         9
     191: getfield      #87                 // Field android/support/v7/g/c$f.a:I
     194: iload_3
     195: iadd
     196: aload         9
     198: getfield      #88                 // Field android/support/v7/g/c$f.b:I
     201: iload_3
     202: iadd
     203: invokevirtual #151                // Method android/support/v7/g/c$a.c:(II)Ljava/lang/Object;
     206: invokevirtual #192                // Method android/support/v7/g/b.a:(IILjava/lang/Object;)V
     209: iload_3
     210: iconst_1
     211: isub
     212: istore_3
     213: goto          153
     216: aload         9
     218: getfield      #87                 // Field android/support/v7/g/c$f.a:I
     221: istore_3
     222: aload         9
     224: getfield      #88                 // Field android/support/v7/g/c$f.b:I
     227: istore        4
     229: iload_2
     230: iconst_1
     231: isub
     232: istore_2
     233: goto          58
     236: aload_1
     237: invokevirtual #193                // Method android/support/v7/g/b.a:()V
     240: return
}
