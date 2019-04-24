class android.support.v7.widget.RecyclerView$6 implements android.support.v7.widget.f$a {
  final android.support.v7.widget.RecyclerView a;

  android.support.v7.widget.RecyclerView$6(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public android.support.v7.widget.RecyclerView$x a(int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: iload_1
       5: iconst_1
       6: invokevirtual #24                 // Method android/support/v7/widget/RecyclerView.a:(IZ)Landroid/support/v7/widget/RecyclerView$x;
       9: astore_2
      10: aload_2
      11: ifnonnull     16
      14: aconst_null
      15: areturn
      16: aload_0
      17: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      20: getfield      #28                 // Field android/support/v7/widget/RecyclerView.f:Landroid/support/v7/widget/aj;
      23: aload_2
      24: getfield      #33                 // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      27: invokevirtual #39                 // Method android/support/v7/widget/aj.c:(Landroid/view/View;)Z
      30: ifeq          35
      33: aconst_null
      34: areturn
      35: aload_2
      36: areturn

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: iload_1
       5: iload_2
       6: iconst_1
       7: invokevirtual #43                 // Method android/support/v7/widget/RecyclerView.a:(IIZ)V
      10: aload_0
      11: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      14: iconst_1
      15: putfield      #47                 // Field android/support/v7/widget/RecyclerView.D:Z
      18: aload_0
      19: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      22: getfield      #51                 // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      25: astore_3
      26: aload_3
      27: aload_3
      28: getfield      #56                 // Field android/support/v7/widget/RecyclerView$u.b:I
      31: iload_2
      32: iadd
      33: putfield      #56                 // Field android/support/v7/widget/RecyclerView$u.b:I
      36: return

  public void a(int, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: iload_1
       5: iload_2
       6: aload_3
       7: invokevirtual #59                 // Method android/support/v7/widget/RecyclerView.a:(IILjava/lang/Object;)V
      10: aload_0
      11: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      14: iconst_1
      15: putfield      #62                 // Field android/support/v7/widget/RecyclerView.E:Z
      18: return

  public void a(android.support.v7.widget.f$b);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #65                 // Method c:(Landroid/support/v7/widget/f$b;)V
       5: return

  public void b(int, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: iload_1
       5: iload_2
       6: iconst_0
       7: invokevirtual #43                 // Method android/support/v7/widget/RecyclerView.a:(IIZ)V
      10: aload_0
      11: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      14: iconst_1
      15: putfield      #47                 // Field android/support/v7/widget/RecyclerView.D:Z
      18: return

  public void b(android.support.v7.widget.f$b);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #65                 // Method c:(Landroid/support/v7/widget/f$b;)V
       5: return

  public void c(int, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: iload_1
       5: iload_2
       6: invokevirtual #68                 // Method android/support/v7/widget/RecyclerView.g:(II)V
       9: aload_0
      10: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      13: iconst_1
      14: putfield      #47                 // Field android/support/v7/widget/RecyclerView.D:Z
      17: return

  void c(android.support.v7.widget.f$b);
    Code:
       0: aload_1
       1: getfield      #72                 // Field android/support/v7/widget/f$b.a:I
       4: istore_2
       5: iload_2
       6: iconst_4
       7: if_icmpeq     111
      10: iload_2
      11: bipush        8
      13: if_icmpeq     87
      16: iload_2
      17: tableswitch   { // 1 to 2
                     1: 64
                     2: 41
               default: 40
          }
      40: return
      41: aload_0
      42: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      45: getfield      #76                 // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
      48: aload_0
      49: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      52: aload_1
      53: getfield      #77                 // Field android/support/v7/widget/f$b.b:I
      56: aload_1
      57: getfield      #80                 // Field android/support/v7/widget/f$b.d:I
      60: invokevirtual #85                 // Method android/support/v7/widget/RecyclerView$i.b:(Landroid/support/v7/widget/RecyclerView;II)V
      63: return
      64: aload_0
      65: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      68: getfield      #76                 // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
      71: aload_0
      72: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      75: aload_1
      76: getfield      #77                 // Field android/support/v7/widget/f$b.b:I
      79: aload_1
      80: getfield      #80                 // Field android/support/v7/widget/f$b.d:I
      83: invokevirtual #87                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/support/v7/widget/RecyclerView;II)V
      86: return
      87: aload_0
      88: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      91: getfield      #76                 // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
      94: aload_0
      95: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      98: aload_1
      99: getfield      #77                 // Field android/support/v7/widget/f$b.b:I
     102: aload_1
     103: getfield      #80                 // Field android/support/v7/widget/f$b.d:I
     106: iconst_1
     107: invokevirtual #90                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/support/v7/widget/RecyclerView;III)V
     110: return
     111: aload_0
     112: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
     115: getfield      #76                 // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
     118: aload_0
     119: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
     122: aload_1
     123: getfield      #77                 // Field android/support/v7/widget/f$b.b:I
     126: aload_1
     127: getfield      #80                 // Field android/support/v7/widget/f$b.d:I
     130: aload_1
     131: getfield      #93                 // Field android/support/v7/widget/f$b.c:Ljava/lang/Object;
     134: invokevirtual #96                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/support/v7/widget/RecyclerView;IILjava/lang/Object;)V
     137: return

  public void d(int, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: iload_1
       5: iload_2
       6: invokevirtual #98                 // Method android/support/v7/widget/RecyclerView.f:(II)V
       9: aload_0
      10: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      13: iconst_1
      14: putfield      #47                 // Field android/support/v7/widget/RecyclerView.D:Z
      17: return
}
