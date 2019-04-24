public class android.support.transition.y extends android.support.transition.u {
  public android.support.transition.y();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method android/support/transition/u."<init>":()V
       4: aload_0
       5: new           #23                 // class java/util/ArrayList
       8: dup
       9: invokespecial #24                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #26                 // Field g:Ljava/util/ArrayList;
      15: aload_0
      16: iconst_1
      17: putfield      #28                 // Field h:Z
      20: aload_0
      21: iconst_0
      22: putfield      #30                 // Field j:Z
      25: return

  static boolean a(android.support.transition.y);
    Code:
       0: aload_0
       1: getfield      #30                 // Field j:Z
       4: ireturn

  static boolean a(android.support.transition.y, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #30                 // Field j:Z
       5: iload_1
       6: ireturn

  static int b(android.support.transition.y);
    Code:
       0: aload_0
       1: getfield      #37                 // Field i:I
       4: iconst_1
       5: isub
       6: istore_1
       7: aload_0
       8: iload_1
       9: putfield      #37                 // Field i:I
      12: iload_1
      13: ireturn

  static int c(android.support.transition.y);
    Code:
       0: aload_0
       1: getfield      #37                 // Field i:I
       4: ireturn

  public android.support.transition.u a(long);
    Code:
       0: aload_0
       1: lload_1
       2: invokevirtual #67                 // Method c:(J)Landroid/support/transition/y;
       5: areturn

  public android.support.transition.u a(android.support.transition.u$c);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #70                 // Method c:(Landroid/support/transition/u$c;)Landroid/support/transition/y;
       5: areturn

  public android.support.transition.y a(int);
    Code:
       0: iload_1
       1: tableswitch   { // 0 to 1
                     0: 62
                     1: 57
               default: 24
          }
      24: new           #73                 // class java/lang/StringBuilder
      27: dup
      28: invokespecial #74                 // Method java/lang/StringBuilder."<init>":()V
      31: astore_3
      32: aload_3
      33: ldc           #76                 // String Invalid parameter for TransitionSet ordering:
      35: invokevirtual #80                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      38: pop
      39: aload_3
      40: iload_1
      41: invokevirtual #83                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      44: pop
      45: new           #85                 // class android/util/AndroidRuntimeException
      48: dup
      49: aload_3
      50: invokevirtual #89                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      53: invokespecial #92                 // Method android/util/AndroidRuntimeException."<init>":(Ljava/lang/String;)V
      56: athrow
      57: iconst_0
      58: istore_2
      59: goto          64
      62: iconst_1
      63: istore_2
      64: aload_0
      65: iload_2
      66: putfield      #28                 // Field h:Z
      69: aload_0
      70: areturn

  java.lang.String a(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #95                 // Method android/support/transition/u.a:(Ljava/lang/String;)Ljava/lang/String;
       5: astore_3
       6: iconst_0
       7: istore_2
       8: iload_2
       9: aload_0
      10: getfield      #26                 // Field g:Ljava/util/ArrayList;
      13: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      16: if_icmpge     107
      19: new           #73                 // class java/lang/StringBuilder
      22: dup
      23: invokespecial #74                 // Method java/lang/StringBuilder."<init>":()V
      26: astore        4
      28: aload         4
      30: aload_3
      31: invokevirtual #80                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: pop
      35: aload         4
      37: ldc           #97                 // String \n
      39: invokevirtual #80                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      42: pop
      43: aload_0
      44: getfield      #26                 // Field g:Ljava/util/ArrayList;
      47: iload_2
      48: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      51: checkcast     #4                  // class android/support/transition/u
      54: astore_3
      55: new           #73                 // class java/lang/StringBuilder
      58: dup
      59: invokespecial #74                 // Method java/lang/StringBuilder."<init>":()V
      62: astore        5
      64: aload         5
      66: aload_1
      67: invokevirtual #80                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      70: pop
      71: aload         5
      73: ldc           #103                // String
      75: invokevirtual #80                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      78: pop
      79: aload         4
      81: aload_3
      82: aload         5
      84: invokevirtual #89                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      87: invokevirtual #95                 // Method android/support/transition/u.a:(Ljava/lang/String;)Ljava/lang/String;
      90: invokevirtual #80                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      93: pop
      94: aload         4
      96: invokevirtual #89                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      99: astore_3
     100: iload_2
     101: iconst_1
     102: iadd
     103: istore_2
     104: goto          8
     107: aload_3
     108: areturn

  public void a(android.support.transition.aa);
    Code:
       0: aload_0
       1: aload_1
       2: getfield      #109                // Field android/support/transition/aa.b:Landroid/view/View;
       5: invokevirtual #112                // Method a:(Landroid/view/View;)Z
       8: ifeq          66
      11: aload_0
      12: getfield      #26                 // Field g:Ljava/util/ArrayList;
      15: invokevirtual #46                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
      18: astore_2
      19: aload_2
      20: invokeinterface #52,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      25: ifeq          66
      28: aload_2
      29: invokeinterface #56,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      34: checkcast     #4                  // class android/support/transition/u
      37: astore_3
      38: aload_3
      39: aload_1
      40: getfield      #109                // Field android/support/transition/aa.b:Landroid/view/View;
      43: invokevirtual #113                // Method android/support/transition/u.a:(Landroid/view/View;)Z
      46: ifeq          19
      49: aload_3
      50: aload_1
      51: invokevirtual #115                // Method android/support/transition/u.a:(Landroid/support/transition/aa;)V
      54: aload_1
      55: getfield      #117                // Field android/support/transition/aa.c:Ljava/util/ArrayList;
      58: aload_3
      59: invokevirtual #121                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      62: pop
      63: goto          19
      66: return

  public void a(android.support.transition.u$b);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #124                // Method android/support/transition/u.a:(Landroid/support/transition/u$b;)V
       5: aload_0
       6: getfield      #26                 // Field g:Ljava/util/ArrayList;
       9: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      12: istore_3
      13: iconst_0
      14: istore_2
      15: iload_2
      16: iload_3
      17: if_icmpge     42
      20: aload_0
      21: getfield      #26                 // Field g:Ljava/util/ArrayList;
      24: iload_2
      25: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      28: checkcast     #4                  // class android/support/transition/u
      31: aload_1
      32: invokevirtual #124                // Method android/support/transition/u.a:(Landroid/support/transition/u$b;)V
      35: iload_2
      36: iconst_1
      37: iadd
      38: istore_2
      39: goto          15
      42: return

  protected void a(android.view.ViewGroup, android.support.transition.ab, android.support.transition.ab, java.util.ArrayList<android.support.transition.aa>, java.util.ArrayList<android.support.transition.aa>);
    Code:
       0: aload_0
       1: invokevirtual #128                // Method c:()J
       4: lstore        8
       6: aload_0
       7: getfield      #26                 // Field g:Ljava/util/ArrayList;
      10: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      13: istore        7
      15: iconst_0
      16: istore        6
      18: iload         6
      20: iload         7
      22: if_icmpge     115
      25: aload_0
      26: getfield      #26                 // Field g:Ljava/util/ArrayList;
      29: iload         6
      31: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      34: checkcast     #4                  // class android/support/transition/u
      37: astore        12
      39: lload         8
      41: lconst_0
      42: lcmp
      43: ifle          94
      46: aload_0
      47: getfield      #28                 // Field h:Z
      50: ifne          58
      53: iload         6
      55: ifne          94
      58: aload         12
      60: invokevirtual #129                // Method android/support/transition/u.c:()J
      63: lstore        10
      65: lload         10
      67: lconst_0
      68: lcmp
      69: ifle          86
      72: aload         12
      74: lload         8
      76: lload         10
      78: ladd
      79: invokevirtual #131                // Method android/support/transition/u.b:(J)Landroid/support/transition/u;
      82: pop
      83: goto          94
      86: aload         12
      88: lload         8
      90: invokevirtual #131                // Method android/support/transition/u.b:(J)Landroid/support/transition/u;
      93: pop
      94: aload         12
      96: aload_1
      97: aload_2
      98: aload_3
      99: aload         4
     101: aload         5
     103: invokevirtual #133                // Method android/support/transition/u.a:(Landroid/view/ViewGroup;Landroid/support/transition/ab;Landroid/support/transition/ab;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
     106: iload         6
     108: iconst_1
     109: iadd
     110: istore        6
     112: goto          18
     115: return

  public android.support.transition.u b(int);
    Code:
       0: iload_1
       1: iflt          30
       4: iload_1
       5: aload_0
       6: getfield      #26                 // Field g:Ljava/util/ArrayList;
       9: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      12: if_icmplt     18
      15: goto          30
      18: aload_0
      19: getfield      #26                 // Field g:Ljava/util/ArrayList;
      22: iload_1
      23: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      26: checkcast     #4                  // class android/support/transition/u
      29: areturn
      30: aconst_null
      31: areturn

  public android.support.transition.u b(long);
    Code:
       0: aload_0
       1: lload_1
       2: invokevirtual #139                // Method d:(J)Landroid/support/transition/y;
       5: areturn

  public android.support.transition.u b(android.support.transition.u$c);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #141                // Method d:(Landroid/support/transition/u$c;)Landroid/support/transition/y;
       5: areturn

  public android.support.transition.u b(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #146                // Method f:(Landroid/view/View;)Landroid/support/transition/y;
       5: areturn

  public android.support.transition.y b(android.support.transition.u);
    Code:
       0: aload_0
       1: getfield      #26                 // Field g:Ljava/util/ArrayList;
       4: aload_1
       5: invokevirtual #121                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       8: pop
       9: aload_1
      10: aload_0
      11: putfield      #150                // Field android/support/transition/u.d:Landroid/support/transition/y;
      14: aload_0
      15: getfield      #153                // Field a:J
      18: lconst_0
      19: lcmp
      20: iflt          32
      23: aload_1
      24: aload_0
      25: getfield      #153                // Field a:J
      28: invokevirtual #155                // Method android/support/transition/u.a:(J)Landroid/support/transition/u;
      31: pop
      32: aload_0
      33: areturn

  public void b(android.support.transition.aa);
    Code:
       0: aload_0
       1: aload_1
       2: getfield      #109                // Field android/support/transition/aa.b:Landroid/view/View;
       5: invokevirtual #112                // Method a:(Landroid/view/View;)Z
       8: ifeq          66
      11: aload_0
      12: getfield      #26                 // Field g:Ljava/util/ArrayList;
      15: invokevirtual #46                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
      18: astore_2
      19: aload_2
      20: invokeinterface #52,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      25: ifeq          66
      28: aload_2
      29: invokeinterface #56,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      34: checkcast     #4                  // class android/support/transition/u
      37: astore_3
      38: aload_3
      39: aload_1
      40: getfield      #109                // Field android/support/transition/aa.b:Landroid/view/View;
      43: invokevirtual #113                // Method android/support/transition/u.a:(Landroid/view/View;)Z
      46: ifeq          19
      49: aload_3
      50: aload_1
      51: invokevirtual #157                // Method android/support/transition/u.b:(Landroid/support/transition/aa;)V
      54: aload_1
      55: getfield      #117                // Field android/support/transition/aa.c:Ljava/util/ArrayList;
      58: aload_3
      59: invokevirtual #121                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      62: pop
      63: goto          19
      66: return

  public android.support.transition.u c(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #159                // Method g:(Landroid/view/View;)Landroid/support/transition/y;
       5: areturn

  public android.support.transition.y c(long);
    Code:
       0: aload_0
       1: lload_1
       2: invokespecial #155                // Method android/support/transition/u.a:(J)Landroid/support/transition/u;
       5: pop
       6: aload_0
       7: getfield      #153                // Field a:J
      10: lconst_0
      11: lcmp
      12: iflt          55
      15: aload_0
      16: getfield      #26                 // Field g:Ljava/util/ArrayList;
      19: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      22: istore        4
      24: iconst_0
      25: istore_3
      26: iload_3
      27: iload         4
      29: if_icmpge     55
      32: aload_0
      33: getfield      #26                 // Field g:Ljava/util/ArrayList;
      36: iload_3
      37: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      40: checkcast     #4                  // class android/support/transition/u
      43: lload_1
      44: invokevirtual #155                // Method android/support/transition/u.a:(J)Landroid/support/transition/u;
      47: pop
      48: iload_3
      49: iconst_1
      50: iadd
      51: istore_3
      52: goto          26
      55: aload_0
      56: areturn

  public android.support.transition.y c(android.support.transition.u$c);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #59                 // Method android/support/transition/u.a:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
       5: checkcast     #2                  // class android/support/transition/y
       8: areturn

  void c(android.support.transition.aa);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #161                // Method android/support/transition/u.c:(Landroid/support/transition/aa;)V
       5: aload_0
       6: getfield      #26                 // Field g:Ljava/util/ArrayList;
       9: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      12: istore_3
      13: iconst_0
      14: istore_2
      15: iload_2
      16: iload_3
      17: if_icmpge     42
      20: aload_0
      21: getfield      #26                 // Field g:Ljava/util/ArrayList;
      24: iload_2
      25: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      28: checkcast     #4                  // class android/support/transition/u
      31: aload_1
      32: invokevirtual #161                // Method android/support/transition/u.c:(Landroid/support/transition/aa;)V
      35: iload_2
      36: iconst_1
      37: iadd
      38: istore_2
      39: goto          15
      42: return

  public java.lang.Object clone();
    Code:
       0: aload_0
       1: invokevirtual #166                // Method m:()Landroid/support/transition/u;
       4: areturn

  public android.support.transition.y d(long);
    Code:
       0: aload_0
       1: lload_1
       2: invokespecial #131                // Method android/support/transition/u.b:(J)Landroid/support/transition/u;
       5: checkcast     #2                  // class android/support/transition/y
       8: areturn

  public android.support.transition.y d(android.support.transition.u$c);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #168                // Method android/support/transition/u.b:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
       5: checkcast     #2                  // class android/support/transition/y
       8: areturn

  public void d(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #171                // Method android/support/transition/u.d:(Landroid/view/View;)V
       5: aload_0
       6: getfield      #26                 // Field g:Ljava/util/ArrayList;
       9: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      12: istore_3
      13: iconst_0
      14: istore_2
      15: iload_2
      16: iload_3
      17: if_icmpge     42
      20: aload_0
      21: getfield      #26                 // Field g:Ljava/util/ArrayList;
      24: iload_2
      25: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      28: checkcast     #4                  // class android/support/transition/u
      31: aload_1
      32: invokevirtual #171                // Method android/support/transition/u.d:(Landroid/view/View;)V
      35: iload_2
      36: iconst_1
      37: iadd
      38: istore_2
      39: goto          15
      42: return

  protected void e();
    Code:
       0: aload_0
       1: getfield      #26                 // Field g:Ljava/util/ArrayList;
       4: invokevirtual #175                // Method java/util/ArrayList.isEmpty:()Z
       7: ifeq          19
      10: aload_0
      11: invokevirtual #177                // Method j:()V
      14: aload_0
      15: invokevirtual #180                // Method k:()V
      18: return
      19: aload_0
      20: invokespecial #182                // Method p:()V
      23: aload_0
      24: getfield      #28                 // Field h:Z
      27: ifne          107
      30: iconst_1
      31: istore_1
      32: iload_1
      33: aload_0
      34: getfield      #26                 // Field g:Ljava/util/ArrayList;
      37: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      40: if_icmpge     86
      43: aload_0
      44: getfield      #26                 // Field g:Ljava/util/ArrayList;
      47: iload_1
      48: iconst_1
      49: isub
      50: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      53: checkcast     #4                  // class android/support/transition/u
      56: new           #6                  // class android/support/transition/y$1
      59: dup
      60: aload_0
      61: aload_0
      62: getfield      #26                 // Field g:Ljava/util/ArrayList;
      65: iload_1
      66: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      69: checkcast     #4                  // class android/support/transition/u
      72: invokespecial #185                // Method android/support/transition/y$1."<init>":(Landroid/support/transition/y;Landroid/support/transition/u;)V
      75: invokevirtual #59                 // Method android/support/transition/u.a:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
      78: pop
      79: iload_1
      80: iconst_1
      81: iadd
      82: istore_1
      83: goto          32
      86: aload_0
      87: getfield      #26                 // Field g:Ljava/util/ArrayList;
      90: iconst_0
      91: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      94: checkcast     #4                  // class android/support/transition/u
      97: astore_2
      98: aload_2
      99: ifnull        139
     102: aload_2
     103: invokevirtual #187                // Method android/support/transition/u.e:()V
     106: return
     107: aload_0
     108: getfield      #26                 // Field g:Ljava/util/ArrayList;
     111: invokevirtual #46                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
     114: astore_2
     115: aload_2
     116: invokeinterface #52,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     121: ifeq          139
     124: aload_2
     125: invokeinterface #56,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     130: checkcast     #4                  // class android/support/transition/u
     133: invokevirtual #187                // Method android/support/transition/u.e:()V
     136: goto          115
     139: return

  public void e(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #189                // Method android/support/transition/u.e:(Landroid/view/View;)V
       5: aload_0
       6: getfield      #26                 // Field g:Ljava/util/ArrayList;
       9: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      12: istore_3
      13: iconst_0
      14: istore_2
      15: iload_2
      16: iload_3
      17: if_icmpge     42
      20: aload_0
      21: getfield      #26                 // Field g:Ljava/util/ArrayList;
      24: iload_2
      25: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      28: checkcast     #4                  // class android/support/transition/u
      31: aload_1
      32: invokevirtual #189                // Method android/support/transition/u.e:(Landroid/view/View;)V
      35: iload_2
      36: iconst_1
      37: iadd
      38: istore_2
      39: goto          15
      42: return

  public android.support.transition.y f(android.view.View);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: getfield      #26                 // Field g:Ljava/util/ArrayList;
       7: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      10: if_icmpge     36
      13: aload_0
      14: getfield      #26                 // Field g:Ljava/util/ArrayList;
      17: iload_2
      18: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      21: checkcast     #4                  // class android/support/transition/u
      24: aload_1
      25: invokevirtual #191                // Method android/support/transition/u.b:(Landroid/view/View;)Landroid/support/transition/u;
      28: pop
      29: iload_2
      30: iconst_1
      31: iadd
      32: istore_2
      33: goto          2
      36: aload_0
      37: aload_1
      38: invokespecial #191                // Method android/support/transition/u.b:(Landroid/view/View;)Landroid/support/transition/u;
      41: checkcast     #2                  // class android/support/transition/y
      44: areturn

  public android.support.transition.y g(android.view.View);
    Code:
       0: iconst_0
       1: istore_2
       2: iload_2
       3: aload_0
       4: getfield      #26                 // Field g:Ljava/util/ArrayList;
       7: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      10: if_icmpge     36
      13: aload_0
      14: getfield      #26                 // Field g:Ljava/util/ArrayList;
      17: iload_2
      18: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      21: checkcast     #4                  // class android/support/transition/u
      24: aload_1
      25: invokevirtual #193                // Method android/support/transition/u.c:(Landroid/view/View;)Landroid/support/transition/u;
      28: pop
      29: iload_2
      30: iconst_1
      31: iadd
      32: istore_2
      33: goto          2
      36: aload_0
      37: aload_1
      38: invokespecial #193                // Method android/support/transition/u.c:(Landroid/view/View;)Landroid/support/transition/u;
      41: checkcast     #2                  // class android/support/transition/y
      44: areturn

  public android.support.transition.u m();
    Code:
       0: aload_0
       1: invokespecial #194                // Method android/support/transition/u.m:()Landroid/support/transition/u;
       4: checkcast     #2                  // class android/support/transition/y
       7: astore_3
       8: aload_3
       9: new           #23                 // class java/util/ArrayList
      12: dup
      13: invokespecial #24                 // Method java/util/ArrayList."<init>":()V
      16: putfield      #26                 // Field g:Ljava/util/ArrayList;
      19: aload_0
      20: getfield      #26                 // Field g:Ljava/util/ArrayList;
      23: invokevirtual #63                 // Method java/util/ArrayList.size:()I
      26: istore_2
      27: iconst_0
      28: istore_1
      29: iload_1
      30: iload_2
      31: if_icmpge     60
      34: aload_3
      35: aload_0
      36: getfield      #26                 // Field g:Ljava/util/ArrayList;
      39: iload_1
      40: invokevirtual #101                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      43: checkcast     #4                  // class android/support/transition/u
      46: invokevirtual #194                // Method android/support/transition/u.m:()Landroid/support/transition/u;
      49: invokevirtual #196                // Method b:(Landroid/support/transition/u;)Landroid/support/transition/y;
      52: pop
      53: iload_1
      54: iconst_1
      55: iadd
      56: istore_1
      57: goto          29
      60: aload_3
      61: areturn

  public int o();
    Code:
       0: aload_0
       1: getfield      #26                 // Field g:Ljava/util/ArrayList;
       4: invokevirtual #63                 // Method java/util/ArrayList.size:()I
       7: ireturn
}
