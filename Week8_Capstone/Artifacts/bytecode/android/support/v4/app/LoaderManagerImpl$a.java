public class android.support.v4.app.LoaderManagerImpl$a<D> extends android.arch.lifecycle.j<D> implements android.support.v4.a.b$a<D> {
  android.support.v4.a.b<D> a(boolean);
    Code:
       0: getstatic     #26                 // Field android/support/v4/app/LoaderManagerImpl.a:Z
       3: ifeq          37
       6: new           #28                 // class java/lang/StringBuilder
       9: dup
      10: invokespecial #32                 // Method java/lang/StringBuilder."<init>":()V
      13: astore_2
      14: aload_2
      15: ldc           #34                 // String   Destroying:
      17: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      20: pop
      21: aload_2
      22: aload_0
      23: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      26: pop
      27: ldc           #43                 // String LoaderManager
      29: aload_2
      30: invokevirtual #47                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      33: invokestatic  #53                 // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      36: pop
      37: aload_0
      38: getfield      #55                 // Field c:Landroid/support/v4/a/b;
      41: invokevirtual #60                 // Method android/support/v4/a/b.c:()Z
      44: pop
      45: aload_0
      46: getfield      #55                 // Field c:Landroid/support/v4/a/b;
      49: invokevirtual #63                 // Method android/support/v4/a/b.g:()V
      52: aload_0
      53: getfield      #65                 // Field e:Landroid/support/v4/app/LoaderManagerImpl$b;
      56: astore_2
      57: aload_2
      58: ifnull        74
      61: aload_0
      62: aload_2
      63: invokevirtual #68                 // Method a:(Landroid/arch/lifecycle/k;)V
      66: iload_1
      67: ifeq          74
      70: aload_2
      71: invokevirtual #72                 // Method android/support/v4/app/LoaderManagerImpl$b.b:()V
      74: aload_0
      75: getfield      #55                 // Field c:Landroid/support/v4/a/b;
      78: aload_0
      79: invokevirtual #75                 // Method android/support/v4/a/b.a:(Landroid/support/v4/a/b$a;)V
      82: aload_2
      83: ifnull        93
      86: aload_2
      87: invokevirtual #77                 // Method android/support/v4/app/LoaderManagerImpl$b.a:()Z
      90: ifeq          97
      93: iload_1
      94: ifeq          109
      97: aload_0
      98: getfield      #55                 // Field c:Landroid/support/v4/a/b;
     101: invokevirtual #80                 // Method android/support/v4/a/b.i:()V
     104: aload_0
     105: getfield      #82                 // Field f:Landroid/support/v4/a/b;
     108: areturn
     109: aload_0
     110: getfield      #55                 // Field c:Landroid/support/v4/a/b;
     113: areturn

  public void a(android.arch.lifecycle.k<D>);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #86                 // Method android/arch/lifecycle/j.a:(Landroid/arch/lifecycle/k;)V
       5: aload_0
       6: aconst_null
       7: putfield      #88                 // Field d:Landroid/arch/lifecycle/e;
      10: aload_0
      11: aconst_null
      12: putfield      #65                 // Field e:Landroid/support/v4/app/LoaderManagerImpl$b;
      15: return

  public void a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: aload_3
       1: aload_1
       2: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
       5: aload_3
       6: ldc           #98                 // String mId=
       8: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      11: aload_3
      12: aload_0
      13: getfield      #100                // Field a:I
      16: invokevirtual #103                // Method java/io/PrintWriter.print:(I)V
      19: aload_3
      20: ldc           #105                // String  mArgs=
      22: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      25: aload_3
      26: aload_0
      27: getfield      #107                // Field b:Landroid/os/Bundle;
      30: invokevirtual #111                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
      33: aload_3
      34: aload_1
      35: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      38: aload_3
      39: ldc           #113                // String mLoader=
      41: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      44: aload_3
      45: aload_0
      46: getfield      #55                 // Field c:Landroid/support/v4/a/b;
      49: invokevirtual #111                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
      52: aload_0
      53: getfield      #55                 // Field c:Landroid/support/v4/a/b;
      56: astore        5
      58: new           #28                 // class java/lang/StringBuilder
      61: dup
      62: invokespecial #32                 // Method java/lang/StringBuilder."<init>":()V
      65: astore        6
      67: aload         6
      69: aload_1
      70: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      73: pop
      74: aload         6
      76: ldc           #115                // String
      78: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      81: pop
      82: aload         5
      84: aload         6
      86: invokevirtual #47                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      89: aload_2
      90: aload_3
      91: aload         4
      93: invokevirtual #117                // Method android/support/v4/a/b.a:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
      96: aload_0
      97: getfield      #65                 // Field e:Landroid/support/v4/app/LoaderManagerImpl$b;
     100: ifnull        161
     103: aload_3
     104: aload_1
     105: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     108: aload_3
     109: ldc           #119                // String mCallbacks=
     111: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     114: aload_3
     115: aload_0
     116: getfield      #65                 // Field e:Landroid/support/v4/app/LoaderManagerImpl$b;
     119: invokevirtual #111                // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
     122: aload_0
     123: getfield      #65                 // Field e:Landroid/support/v4/app/LoaderManagerImpl$b;
     126: astore_2
     127: new           #28                 // class java/lang/StringBuilder
     130: dup
     131: invokespecial #32                 // Method java/lang/StringBuilder."<init>":()V
     134: astore        4
     136: aload         4
     138: aload_1
     139: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     142: pop
     143: aload         4
     145: ldc           #115                // String
     147: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     150: pop
     151: aload_2
     152: aload         4
     154: invokevirtual #47                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     157: aload_3
     158: invokevirtual #122                // Method android/support/v4/app/LoaderManagerImpl$b.a:(Ljava/lang/String;Ljava/io/PrintWriter;)V
     161: aload_3
     162: aload_1
     163: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     166: aload_3
     167: ldc           #124                // String mData=
     169: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     172: aload_3
     173: aload_0
     174: invokevirtual #127                // Method e:()Landroid/support/v4/a/b;
     177: aload_0
     178: invokevirtual #130                // Method a:()Ljava/lang/Object;
     181: invokevirtual #133                // Method android/support/v4/a/b.a:(Ljava/lang/Object;)Ljava/lang/String;
     184: invokevirtual #135                // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     187: aload_3
     188: aload_1
     189: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     192: aload_3
     193: ldc           #137                // String mStarted=
     195: invokevirtual #96                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     198: aload_3
     199: aload_0
     200: invokevirtual #139                // Method d:()Z
     203: invokevirtual #142                // Method java/io/PrintWriter.println:(Z)V
     206: return

  protected void b();
    Code:
       0: getstatic     #26                 // Field android/support/v4/app/LoaderManagerImpl.a:Z
       3: ifeq          37
       6: new           #28                 // class java/lang/StringBuilder
       9: dup
      10: invokespecial #32                 // Method java/lang/StringBuilder."<init>":()V
      13: astore_1
      14: aload_1
      15: ldc           #144                // String   Starting:
      17: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      20: pop
      21: aload_1
      22: aload_0
      23: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      26: pop
      27: ldc           #43                 // String LoaderManager
      29: aload_1
      30: invokevirtual #47                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      33: invokestatic  #53                 // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      36: pop
      37: aload_0
      38: getfield      #55                 // Field c:Landroid/support/v4/a/b;
      41: invokevirtual #146                // Method android/support/v4/a/b.a:()V
      44: return

  protected void c();
    Code:
       0: getstatic     #26                 // Field android/support/v4/app/LoaderManagerImpl.a:Z
       3: ifeq          37
       6: new           #28                 // class java/lang/StringBuilder
       9: dup
      10: invokespecial #32                 // Method java/lang/StringBuilder."<init>":()V
      13: astore_1
      14: aload_1
      15: ldc           #148                // String   Stopping:
      17: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      20: pop
      21: aload_1
      22: aload_0
      23: invokevirtual #41                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      26: pop
      27: ldc           #43                 // String LoaderManager
      29: aload_1
      30: invokevirtual #47                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      33: invokestatic  #53                 // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      36: pop
      37: aload_0
      38: getfield      #55                 // Field c:Landroid/support/v4/a/b;
      41: invokevirtual #150                // Method android/support/v4/a/b.e:()V
      44: return

  android.support.v4.a.b<D> e();
    Code:
       0: aload_0
       1: getfield      #55                 // Field c:Landroid/support/v4/a/b;
       4: areturn

  void f();
    Code:
       0: aload_0
       1: getfield      #88                 // Field d:Landroid/arch/lifecycle/e;
       4: astore_1
       5: aload_0
       6: getfield      #65                 // Field e:Landroid/support/v4/app/LoaderManagerImpl$b;
       9: astore_2
      10: aload_1
      11: ifnull        29
      14: aload_2
      15: ifnull        29
      18: aload_0
      19: aload_2
      20: invokespecial #86                 // Method android/arch/lifecycle/j.a:(Landroid/arch/lifecycle/k;)V
      23: aload_0
      24: aload_1
      25: aload_2
      26: invokevirtual #154                // Method a:(Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/k;)V
      29: return

  public java.lang.String toString();
    Code:
       0: new           #28                 // class java/lang/StringBuilder
       3: dup
       4: bipush        64
       6: invokespecial #156                // Method java/lang/StringBuilder."<init>":(I)V
       9: astore_1
      10: aload_1
      11: ldc           #158                // String LoaderInfo{
      13: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      16: pop
      17: aload_1
      18: aload_0
      19: invokestatic  #164                // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      22: invokestatic  #170                // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      25: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      28: pop
      29: aload_1
      30: ldc           #172                // String  #
      32: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      35: pop
      36: aload_1
      37: aload_0
      38: getfield      #100                // Field a:I
      41: invokevirtual #175                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      44: pop
      45: aload_1
      46: ldc           #177                // String  :
      48: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      51: pop
      52: aload_0
      53: getfield      #55                 // Field c:Landroid/support/v4/a/b;
      56: aload_1
      57: invokestatic  #182                // Method android/support/v4/g/d.a:(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
      60: aload_1
      61: ldc           #184                // String }}
      63: invokevirtual #38                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      66: pop
      67: aload_1
      68: invokevirtual #47                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      71: areturn
}
