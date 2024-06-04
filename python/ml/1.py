import matplotlib
from matplotlib import pyplot as plt
import numpy
from sklearn import datasets, linear_model
from sklearn.metrics import mean_squared_error

diabetes = datasets.load_diabetes()
# print(diabetes.keys()) 
# dict_keys(['data', 'target', 'frame', 'DESCR', 'feature_names', 'data_filename', 'target_filename', 'data_module'])

diabetes_X = diabetes.data[:, numpy.newaxis, 2]#type:ignore

diabetes_X_train = diabetes_X[:- 20]
diabetes_X_test = diabetes_X[-10: ]

diabetes_Y_train = diabetes.target[:- 20]#type:ignore
diabetes_Y_test = diabetes.target[-10: ]#type:ignore

model = linear_model.LinearRegression()

model.fit(diabetes_X_train, diabetes_Y_train)

diabetes_Y_presicted = model.predict(diabetes_X_test)

print("Mean sqaured error = ", mean_squared_error(diabetes_Y_test, diabetes_Y_presicted))

print("Weight: ", model.coef_)
print("Intercept: ", model.intercept_)

plt.scatter(diabetes_X_test, diabetes_Y_test)
plt.show()