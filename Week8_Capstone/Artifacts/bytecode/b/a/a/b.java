public class b.a.a.b<T extends b.a.a.a> implements java.lang.Cloneable {
  public b.a.a.b(T);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_m1
       6: putfield      #26                 // Field e:I
       9: aload_0
      10: aload_1
      11: putfield      #28                 // Field a:Lb/a/a/a;
      14: return

  public int a();
    Code:
       0: aload_0
       1: invokevirtual #35                 // Method b:()Z
       4: ifeq          17
       7: iconst_0
       8: istore_1
       9: aload_0
      10: iload_1
      11: putfield      #26                 // Field e:I
      14: goto          38
      17: aload_0
      18: getfield      #26                 // Field e:I
      21: iconst_m1
      22: if_icmpne     38
      25: aload_0
      26: getfield      #37                 // Field b:Lb/a/a/b;
      29: invokevirtual #39                 // Method a:()I
      32: iconst_1
      33: iadd
      34: istore_1
      35: goto          9
      38: aload_0
      39: getfield      #26                 // Field e:I
      42: ireturn

  public void a(b.a.a.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #37                 // Field b:Lb/a/a/b;
       5: return

  public void a(java.util.List<b.a.a.b>);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #43                 // Field c:Ljava/util/List;
       5: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #37                 // Field b:Lb/a/a/b;
       4: ifnonnull     9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #43                 // Field c:Ljava/util/List;
       4: ifnull        24
       7: aload_0
       8: getfield      #43                 // Field c:Ljava/util/List;
      11: invokeinterface #49,  1           // InterfaceMethod java/util/List.isEmpty:()Z
      16: ifeq          22
      19: goto          24
      22: iconst_0
      23: ireturn
      24: iconst_1
      25: ireturn

  protected java.lang.Object clone();
    Code:
       0: aload_0
       1: invokevirtual #55                 // Method h:()Lb/a/a/b;
       4: areturn

  public T d();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Lb/a/a/a;
       4: areturn

  public java.util.List<b.a.a.b> e();
    Code:
       0: aload_0
       1: getfield      #43                 // Field c:Ljava/util/List;
       4: areturn

  public boolean f();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #62                 // Field d:Z
       5: iconst_1
       6: ixor
       7: putfield      #62                 // Field d:Z
      10: aload_0
      11: getfield      #62                 // Field d:Z
      14: ireturn

  public boolean g();
    Code:
       0: aload_0
       1: getfield      #62                 // Field d:Z
       4: ireturn

  protected b.a.a.b<T> h();
    Code:
       0: new           #2                  // class b/a/a/b
       3: dup
       4: aload_0
       5: getfield      #28                 // Field a:Lb/a/a/a;
       8: invokespecial #65                 // Method "<init>":(Lb/a/a/a;)V
      11: astore_1
      12: aload_1
      13: aload_0
      14: getfield      #62                 // Field d:Z
      17: putfield      #62                 // Field d:Z
      20: aload_1
      21: areturn

  public java.lang.String toString();
    Code:
       0: new           #70                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #71                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_2
       8: aload_2
       9: ldc           #73                 // String TreeNode{content=
      11: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_2
      16: aload_0
      17: getfield      #28                 // Field a:Lb/a/a/a;
      20: invokevirtual #80                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_2
      25: ldc           #82                 // String , parent=
      27: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_0
      32: getfield      #37                 // Field b:Lb/a/a/b;
      35: ifnonnull     44
      38: ldc           #84                 // String null
      40: astore_1
      41: goto          55
      44: aload_0
      45: getfield      #37                 // Field b:Lb/a/a/b;
      48: invokevirtual #86                 // Method d:()Lb/a/a/a;
      51: invokevirtual #88                 // Method java/lang/Object.toString:()Ljava/lang/String;
      54: astore_1
      55: aload_2
      56: aload_1
      57: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      60: pop
      61: aload_2
      62: ldc           #90                 // String , childList=
      64: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      67: pop
      68: aload_0
      69: getfield      #43                 // Field c:Ljava/util/List;
      72: ifnonnull     81
      75: ldc           #84                 // String null
      77: astore_1
      78: goto          89
      81: aload_0
      82: getfield      #43                 // Field c:Ljava/util/List;
      85: invokevirtual #88                 // Method java/lang/Object.toString:()Ljava/lang/String;
      88: astore_1
      89: aload_2
      90: aload_1
      91: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      94: pop
      95: aload_2
      96: ldc           #92                 // String , isExpand=
      98: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     101: pop
     102: aload_2
     103: aload_0
     104: getfield      #62                 // Field d:Z
     107: invokevirtual #95                 // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
     110: pop
     111: aload_2
     112: bipush        125
     114: invokevirtual #98                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     117: pop
     118: aload_2
     119: invokevirtual #99                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     122: areturn
}
