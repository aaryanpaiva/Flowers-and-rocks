# Flowers and Rocks (Flowers) Problem

![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)

## Table of Contents

- [Problem Description](#problem-description)
- [Solution Algorithm](#solution-algorithm)
- [Input Data](#input-data)
- [Output Data](#output-data)
- [Usage](#usage)
- [License](#license)
- [Author](#author)

## Problem Description

A farmer needs to plant flowers in a rectangular field where some areas are occupied by rocks, and some are suitable for planting flowers. The goal is to find the maximum flower distribution distance to ensure all flowers can be planted while adhering to certain conditions.

- The field is represented as a W × H rectangle.
- Flowers must be placed as far apart as possible.
- Flower distance is calculated using the Manhattan distance formula.
- The flower distance for a specific distribution is the minimum distance between any two flowers.

Your task is to find the maximum flower distribution distance to guarantee planting all flowers.

## Solution Algorithm

- For each test case, we use an algorithm to find the optimal flower distribution distance.
- The algorithm involves determining the maximum distance between flowers that allows planting all flowers in the field.
- We calculate the Manhattan distance between all pairs of flower locations and find the minimum distance.
- This algorithm ensures that flowers are planted as far apart as possible while meeting the requirements.

## Input Data

- The input file contains test cases.
- Each test case includes:
  - W: Field width.
  - H: Field height.
  - F: Number of flowers to plant.
  - G: Number of ground patches (suitable for planting) in the field.
  - Coordinates (X, Y) of ground patches.
- Coordinates start from (0, 0) at the upper-left corner.

## Output Data

- The output file contains the maximum flower distribution distance for each test case.
- The distance ensures that all F flowers can be planted in the field.

## Usage

1. Clone the repository to your local machine.
2. Prepare an input file (e.g., `input.txt`) with test cases in the specified format.
3. Run the Java program (e.g., `Main.java`) to find the maximum flower distribution distance.
4. The results are written to an output file (e.g., `output.txt`).


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Author
Aaryan Paiva


