public final class ryey.easer.core.a.j implements ryey.easer.core.a.i,ryey.easer.core.a.l,ryey.easer.core.a.m {
  protected java.lang.String a;

  protected boolean b;

  protected java.lang.String c;

  protected java.lang.String d;

  public ryey.easer.core.a.j(int);
    Code:
       0: aload_0
       1: invokespecial #32                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #34                 // Field b:Z
       9: aload_0
      10: iconst_0
      11: putfield      #36                 // Field h:Z
      14: aload_0
      15: iconst_1
      16: putfield      #38                 // Field i:Z
      19: aload_0
      20: iconst_0
      21: putfield      #40                 // Field j:Z
      24: aload_0
      25: iload_1
      26: putfield      #42                 // Field e:I
      29: return

  public java.lang.String a();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Ljava/lang/String;
       4: areturn

  public void a(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #46                 // Field a:Ljava/lang/String;
       5: return

  public void a(ryey.easer.commons.local_plugin.b.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #50                 // Field k:Lryey/easer/commons/local_plugin/b/b;
       5: return

  public void a(ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #57                 // Method ryey/easer/core/a/c.a:(Lryey/easer/commons/local_plugin/eventplugin/EventData;)Lryey/easer/core/a/c;
       5: putfield      #59                 // Field f:Lryey/easer/core/a/c;
       8: return

  public void a(ryey.easer.core.a.b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #63                 // Field g:Lryey/easer/core/a/b;
       5: return

  public void a(ryey.easer.core.a.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #59                 // Field f:Lryey/easer/core/a/c;
       5: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #34                 // Field b:Z
       5: return

  public void b(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #67                 // Field c:Ljava/lang/String;
       5: return

  public void b(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #38                 // Field i:Z
       5: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Ljava/lang/String;
       4: ifnull        94
       7: aload_0
       8: getfield      #46                 // Field a:Ljava/lang/String;
      11: invokevirtual #73                 // Method java/lang/String.isEmpty:()Z
      14: ifeq          19
      17: iconst_0
      18: ireturn
      19: aload_0
      20: getfield      #59                 // Field f:Lryey/easer/core/a/c;
      23: ifnonnull     31
      26: iconst_1
      27: istore_1
      28: goto          33
      31: iconst_0
      32: istore_1
      33: aload_0
      34: getfield      #63                 // Field g:Lryey/easer/core/a/b;
      37: ifnonnull     45
      40: iconst_1
      41: istore_2
      42: goto          47
      45: iconst_0
      46: istore_2
      47: iload_1
      48: iload_2
      49: if_icmpne     54
      52: iconst_0
      53: ireturn
      54: aload_0
      55: getfield      #59                 // Field f:Lryey/easer/core/a/c;
      58: ifnull        73
      61: aload_0
      62: getfield      #59                 // Field f:Lryey/easer/core/a/c;
      65: invokevirtual #75                 // Method ryey/easer/core/a/c.b:()Z
      68: ifne          73
      71: iconst_0
      72: ireturn
      73: aload_0
      74: getfield      #63                 // Field g:Lryey/easer/core/a/b;
      77: ifnull        92
      80: aload_0
      81: getfield      #63                 // Field g:Lryey/easer/core/a/b;
      84: invokevirtual #78                 // Method ryey/easer/core/a/b.b:()Z
      87: ifne          92
      90: iconst_0
      91: ireturn
      92: iconst_1
      93: ireturn
      94: iconst_0
      95: ireturn

  public void c(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #80                 // Field d:Ljava/lang/String;
       5: return

  public void c(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #40                 // Field j:Z
       5: return

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #59                 // Field f:Lryey/easer/core/a/c;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public int d();
    Code:
       0: aload_0
       1: getfield      #42                 // Field e:I
       4: ireturn

  public void d(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #36                 // Field h:Z
       5: return

  public ryey.easer.core.a.c e();
    Code:
       0: aload_0
       1: getfield      #59                 // Field f:Lryey/easer/core/a/c;
       4: areturn

  public boolean f();
    Code:
       0: aload_0
       1: getfield      #63                 // Field g:Lryey/easer/core/a/b;
       4: ifnull        9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public ryey.easer.core.a.b g();
    Code:
       0: aload_0
       1: getfield      #63                 // Field g:Lryey/easer/core/a/b;
       4: areturn

  public boolean h();
    Code:
       0: aload_0
       1: getfield      #34                 // Field b:Z
       4: ireturn

  public java.lang.String i();
    Code:
       0: aload_0
       1: getfield      #67                 // Field c:Ljava/lang/String;
       4: areturn

  public java.lang.String j();
    Code:
       0: aload_0
       1: getfield      #80                 // Field d:Ljava/lang/String;
       4: areturn

  public boolean k();
    Code:
       0: aload_0
       1: getfield      #38                 // Field i:Z
       4: ireturn

  public boolean l();
    Code:
       0: aload_0
       1: getfield      #40                 // Field j:Z
       4: ireturn

  public boolean m();
    Code:
       0: aload_0
       1: getfield      #36                 // Field h:Z
       4: ireturn

  public ryey.easer.commons.local_plugin.b.b n();
    Code:
       0: aload_0
       1: getfield      #50                 // Field k:Lryey/easer/commons/local_plugin/b/b;
       4: areturn
}
