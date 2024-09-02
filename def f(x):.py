def f(x):
  return x**3-x*x-2
def df(x):
  return 3*x*x-2*x
a=float(input("Initial guess="))
n=int(input( "Number Interations"))
k=1
while(k<=n):
  r=a-f(a)/df(a)
  print("root=",r, "at Iteration", k)
  k=k+1
  a=r
  