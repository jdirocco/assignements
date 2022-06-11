import pandas as pd
df = pd.read_csv('100 Sales Records.csv', header=0)  
df2 = df.groupby('Region')['Units Sold', 'Unit Price'].sum()
print(df2.head())
