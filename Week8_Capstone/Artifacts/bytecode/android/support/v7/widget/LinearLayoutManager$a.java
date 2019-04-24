class android.support.v7.widget.LinearLayoutManager$a {
  android.support.v7.widget.ba a;

  int b;

  int c;

  boolean d;

  boolean e;

  android.support.v7.widget.LinearLayoutManager$a();
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: invokevirtual #20                 // Method a:()V
       8: return

  void a();
    Code:
       0: aload_0
       1: iconst_m1
       2: putfield      #23                 // Field b:I
       5: aload_0
       6: ldc           #24                 // int -2147483648
       8: putfield      #26                 // Field c:I
      11: aload_0
      12: iconst_0
      13: putfield      #28                 // Field d:Z
      16: aload_0
      17: iconst_0
      18: putfield      #30                 // Field e:Z
      21: return

  public void a(android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
       4: invokevirtual #38                 // Method android/support/v7/widget/ba.b:()I
       7: istore_3
       8: iload_3
       9: iflt          19
      12: aload_0
      13: aload_1
      14: iload_2
      15: invokevirtual #40                 // Method b:(Landroid/view/View;I)V
      18: return
      19: aload_0
      20: iload_2
      21: putfield      #23                 // Field b:I
      24: aload_0
      25: getfield      #28                 // Field d:Z
      28: ifeq          135
      31: aload_0
      32: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      35: invokevirtual #42                 // Method android/support/v7/widget/ba.d:()I
      38: iload_3
      39: isub
      40: aload_0
      41: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      44: aload_1
      45: invokevirtual #45                 // Method android/support/v7/widget/ba.b:(Landroid/view/View;)I
      48: isub
      49: istore_2
      50: aload_0
      51: aload_0
      52: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      55: invokevirtual #42                 // Method android/support/v7/widget/ba.d:()I
      58: iload_2
      59: isub
      60: putfield      #26                 // Field c:I
      63: iload_2
      64: ifle          240
      67: aload_0
      68: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      71: aload_1
      72: invokevirtual #47                 // Method android/support/v7/widget/ba.e:(Landroid/view/View;)I
      75: istore_3
      76: aload_0
      77: getfield      #26                 // Field c:I
      80: istore        4
      82: aload_0
      83: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      86: invokevirtual #49                 // Method android/support/v7/widget/ba.c:()I
      89: istore        5
      91: iload         4
      93: iload_3
      94: isub
      95: iload         5
      97: aload_0
      98: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
     101: aload_1
     102: invokevirtual #51                 // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
     105: iload         5
     107: isub
     108: iconst_0
     109: invokestatic  #57                 // Method java/lang/Math.min:(II)I
     112: iadd
     113: isub
     114: istore_3
     115: iload_3
     116: ifge          240
     119: aload_0
     120: aload_0
     121: getfield      #26                 // Field c:I
     124: iload_2
     125: iload_3
     126: ineg
     127: invokestatic  #57                 // Method java/lang/Math.min:(II)I
     130: iadd
     131: putfield      #26                 // Field c:I
     134: return
     135: aload_0
     136: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
     139: aload_1
     140: invokevirtual #51                 // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
     143: istore        4
     145: iload         4
     147: aload_0
     148: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
     151: invokevirtual #49                 // Method android/support/v7/widget/ba.c:()I
     154: isub
     155: istore_2
     156: aload_0
     157: iload         4
     159: putfield      #26                 // Field c:I
     162: iload_2
     163: ifle          240
     166: aload_0
     167: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
     170: aload_1
     171: invokevirtual #47                 // Method android/support/v7/widget/ba.e:(Landroid/view/View;)I
     174: istore        5
     176: aload_0
     177: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
     180: invokevirtual #42                 // Method android/support/v7/widget/ba.d:()I
     183: istore        6
     185: aload_0
     186: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
     189: aload_1
     190: invokevirtual #45                 // Method android/support/v7/widget/ba.b:(Landroid/view/View;)I
     193: istore        7
     195: aload_0
     196: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
     199: invokevirtual #42                 // Method android/support/v7/widget/ba.d:()I
     202: iconst_0
     203: iload         6
     205: iload_3
     206: isub
     207: iload         7
     209: isub
     210: invokestatic  #57                 // Method java/lang/Math.min:(II)I
     213: isub
     214: iload         4
     216: iload         5
     218: iadd
     219: isub
     220: istore_3
     221: iload_3
     222: ifge          240
     225: aload_0
     226: aload_0
     227: getfield      #26                 // Field c:I
     230: iload_2
     231: iload_3
     232: ineg
     233: invokestatic  #57                 // Method java/lang/Math.min:(II)I
     236: isub
     237: putfield      #26                 // Field c:I
     240: return

  boolean a(android.view.View, android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_1
       1: invokevirtual #64                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
       4: checkcast     #66                 // class android/support/v7/widget/RecyclerView$j
       7: astore_1
       8: aload_1
       9: invokevirtual #69                 // Method android/support/v7/widget/RecyclerView$j.d:()Z
      12: ifne          35
      15: aload_1
      16: invokevirtual #72                 // Method android/support/v7/widget/RecyclerView$j.f:()I
      19: iflt          35
      22: aload_1
      23: invokevirtual #72                 // Method android/support/v7/widget/RecyclerView$j.f:()I
      26: aload_2
      27: invokevirtual #76                 // Method android/support/v7/widget/RecyclerView$u.e:()I
      30: if_icmpge     35
      33: iconst_1
      34: ireturn
      35: iconst_0
      36: ireturn

  void b();
    Code:
       0: aload_0
       1: getfield      #28                 // Field d:Z
       4: ifeq          18
       7: aload_0
       8: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      11: invokevirtual #42                 // Method android/support/v7/widget/ba.d:()I
      14: istore_1
      15: goto          26
      18: aload_0
      19: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      22: invokevirtual #49                 // Method android/support/v7/widget/ba.c:()I
      25: istore_1
      26: aload_0
      27: iload_1
      28: putfield      #26                 // Field c:I
      31: return

  public void b(android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #28                 // Field d:Z
       4: ifeq          32
       7: aload_0
       8: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      11: aload_1
      12: invokevirtual #45                 // Method android/support/v7/widget/ba.b:(Landroid/view/View;)I
      15: aload_0
      16: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      19: invokevirtual #38                 // Method android/support/v7/widget/ba.b:()I
      22: iadd
      23: istore_3
      24: aload_0
      25: iload_3
      26: putfield      #26                 // Field c:I
      29: goto          44
      32: aload_0
      33: getfield      #33                 // Field a:Landroid/support/v7/widget/ba;
      36: aload_1
      37: invokevirtual #51                 // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
      40: istore_3
      41: goto          24
      44: aload_0
      45: iload_2
      46: putfield      #23                 // Field b:I
      49: return

  public java.lang.String toString();
    Code:
       0: new           #80                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #81                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #83                 // String AnchorInfo{mPosition=
      11: invokevirtual #87                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #23                 // Field b:I
      20: invokevirtual #90                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #92                 // String , mCoordinate=
      27: invokevirtual #87                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #26                 // Field c:I
      36: invokevirtual #90                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #94                 // String , mLayoutFromEnd=
      43: invokevirtual #87                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: aload_0
      49: getfield      #28                 // Field d:Z
      52: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
      55: pop
      56: aload_1
      57: ldc           #99                 // String , mValid=
      59: invokevirtual #87                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      62: pop
      63: aload_1
      64: aload_0
      65: getfield      #30                 // Field e:Z
      68: invokevirtual #97                 // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
      71: pop
      72: aload_1
      73: bipush        125
      75: invokevirtual #102                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      78: pop
      79: aload_1
      80: invokevirtual #104                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      83: areturn
}
